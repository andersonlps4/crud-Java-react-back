package com.anderson.escolas.controllers;

import java.util.List;
import java.util.Optional;

//import java.time.LocalDateTime;
//import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.dto.AlunoDto;
import com.anderson.escolas.models.AlunoModel;
import com.anderson.escolas.services.AlunoService;
//import com.api.parkingcontrol.models.AlunoModel;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/aluno")
public class AlunoController {
	
	final AlunoService alunoService;
	
	public AlunoController(AlunoService alunoService) {
	this.alunoService = alunoService;
}
	@PostMapping
	public ResponseEntity<Object> saveAluno(@RequestBody @Valid AlunoDto alunoDto){
		if(alunoService.existsByNrCpf(alunoDto.getNrCpf())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: número de cpf já cadastrado!");
		}
		if(alunoService.existsByNrRm(alunoDto.getNrRm())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: número de RM já cadastrado!");
		}
		
		
		AlunoModel alunoModel = new AlunoModel();
		BeanUtils.copyProperties(alunoDto, alunoModel);
		//alunoModel.setDtNascimento(LocalDateTime.now(ZoneId.of("UTC")).toString());
		return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(alunoModel));
		
	
}
	
	@GetMapping
	public ResponseEntity<List<AlunoModel>> getAllAluno(){
		return ResponseEntity.status(HttpStatus.OK).body(alunoService.findAll());
		
	}
	@GetMapping("/{ciAluno}")
	public ResponseEntity<Object> getOneAluno(@PathVariable(value = "ciAluno")Long ciAluno){
		Optional<AlunoModel> alunoModelOptional = alunoService.findByCiAluno(ciAluno);
		if (!alunoModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Codigo não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(alunoModelOptional.get());
	}
	
	@DeleteMapping("/{ciAluno}")
	public ResponseEntity<Object> deleteAluno(@PathVariable(value = "ciAluno")Long ciAluno){
		Optional<AlunoModel> alunoModelOptional = alunoService.findByCiAluno(ciAluno);
		if (!alunoModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Codigo não encontrado!");
		}
		alunoService.delete(alunoModelOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("Aluno deletado com sucesso!");
	}
	
	@PutMapping("/{ciAluno}")
	public ResponseEntity<Object> updateAluno(@PathVariable(value = "ciAluno")Long ciAluno,
	@RequestBody @Valid AlunoDto alunoDto){
		Optional<AlunoModel> alunoModelOptional = alunoService.findByCiAluno(ciAluno);
		if(!alunoModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Codigo não encontrado");
		}
		AlunoModel alunoModel = new AlunoModel();
		BeanUtils.copyProperties(alunoDto, alunoModel);
		alunoModel.setCiAluno(alunoModelOptional.get().getCiAluno());
		return ResponseEntity.status(HttpStatus.OK).body(alunoService.save(alunoModel));
		}
	}

		
	

















