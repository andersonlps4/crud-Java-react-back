package com.anderson.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AlunoDto {
	
	
	private String nmAluno;
	
	@Size(max = 11)
	private String nrCpf;
	public String getNrCpf() {
		return nrCpf;
	}
	public void setNrCpf(String nrCpf) {
		this.nrCpf = nrCpf;
	}
	
	private String dtNascimento;
	
	private String sexo;
	
	private String nmMae;
	
	@Size(max = 11)
	private String nrCpfMae;
	
	private String flAtivo;
	
	private String nrRm;
	
	
	public String getNmAluno() {
		return nmAluno;
	}
	public void setNmAluno(String nmAluno) {
		this.nmAluno = nmAluno;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNmMae() {
		return nmMae;
	}
	public void setNmMae(String nmMae) {
		this.nmMae = nmMae;
	}
	public String getNrCpfMae() {
		return nrCpfMae;
	}
	public void setNrCpfMae(String nrCpfMae) {
		this.nrCpfMae = nrCpfMae;
	}
	public String getFlAtivo() {
		return flAtivo;
	}
	public void setFlAtivo(String flAtivo) {
		this.flAtivo = flAtivo;
	}
	public String getNrRm() {
		return nrRm;
	}
	public void setNrRm(String nrRm) {
		this.nrRm = nrRm;
	}
	
	

}
