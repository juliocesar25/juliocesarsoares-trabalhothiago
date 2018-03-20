package com.example.projetoCrud.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.projetoCrud.domain.enums.EstadoCivil;
import com.example.projetoCrud.repositories.CursoRepository;

public class AlunoDTO implements Serializable {
	
	@Autowired
	private CursoRepository repo;
	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotNull	
	private String nome;
	
	@NotNull		
	private int matricula;	
	
	@Min(0)
	@Max(10)	
	private float cr;
	
	private Integer estadoCivil;
	
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
	public float getCr() {
		return cr;
	}
	
	public void setCr(float cr) {
		this.cr = cr;
	}
	public EstadoCivil getEstadoCivil() {
		return EstadoCivil.toEnum(estadoCivil);
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil.getCod();
	}
	

	public Integer getCurso() {
		return curso;
	}


	public void setCurso(Integer curso) {
		this.curso = curso;
	}

}
