package com.anderson.escolas.services;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anderson.escolas.models.AlunoModel;
import com.anderson.escolas.repositories.AlunoRepository;

@Service
public class AlunoService {

final AlunoRepository alunoRepository;

public AlunoService(AlunoRepository alunoRepository) {
	this.alunoRepository = alunoRepository;
}

@Transactional
public AlunoModel save(AlunoModel alunoModel) {
	return alunoRepository.save(alunoModel);
}
public boolean existsByNrCpf(String nrCpf) {
	return alunoRepository.existsByNrCpf(nrCpf);
}
public boolean existsByNrRm(String nrRm) {
	return alunoRepository.existsByNrRm(nrRm);
}

public List<AlunoModel> findAll() {
	
	return alunoRepository.findAll();
}

public Optional<AlunoModel> findByCiAluno(Long ciAluno) {
	return alunoRepository.findById(ciAluno);
}
}
