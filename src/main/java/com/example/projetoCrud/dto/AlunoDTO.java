package com.example.projetoCrud.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.projetoCrud.domain.Aluno;
import com.example.projetoCrud.domain.Curso;
import com.example.projetoCrud.repositories.AlunoRepository;
import com.example.projetoCrud.repositories.CursoRepository;

public class AlunoDTO implements Serializable {
	
	@Autowired
	private CursoRepository repo;
	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotNull
	@Length(min = 5, max = 120, message = "O tamanho deve ser entre 5 e 120 caracteres")
	private String nome;

	
	@NotNull
		
	private int matricula;
	
	private String anoNascimento;
	
	
	private Integer curso;

	public AlunoDTO() {
		super();
	}
	

	
	



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}


	public Integer getCurso() {
		return curso;
	}


	public void setCurso(Integer curso) {
		this.curso = curso;
	}
	
	

}
