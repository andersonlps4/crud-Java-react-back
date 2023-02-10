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
}
