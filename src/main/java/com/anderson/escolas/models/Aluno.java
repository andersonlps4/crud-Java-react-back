package com.anderson.escolas.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "escola")

public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID ciAluno;
	@Column(nullable = false, length = 80)
	private String nmAluno;
	@Column(nullable = false, unique = true, length = 11)
	private String nrCpf;
	@Column(nullable = false, length = 10)
	private String dtNascimento;
	@Column(nullable = false, length = 1)
	private String sexo;
	@Column(nullable = false, length = 80)
	private String nmMae;
	@Column(nullable = false, unique = true, length = 11)
	private String nrCpfMae;
	@Column(nullable = false, length = 1)
	private String flAtivo;
	@Column(nullable = false, unique = true, length = 10)
	private String nrRm;
	
	
	public UUID getCiAluno() {
		return ciAluno;
	}
	public void setCiAluno(UUID ciAluno) {
		this.ciAluno = ciAluno;
	}
	public String getNmAluno() {
		return nmAluno;
	}
	public void setNmAluno(String nmAluno) {
		this.nmAluno = nmAluno;
	}
	public String getNrCpf() {
		return nrCpf;
	}
	public void setNrCpf(String nrCpf) {
		this.nrCpf = nrCpf;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
