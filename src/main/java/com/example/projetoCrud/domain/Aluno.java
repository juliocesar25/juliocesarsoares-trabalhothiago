package com.example.projetoCrud.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.projetoCrud.domain.enums.EstadoCivil;

@Entity
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	private int matricula;

	private float cr;
	
	private Integer estadoCivil;
	
	@ManyToOne
	@JoinColumn(name = "ID_CURSO")
	private Curso curso;


	public Aluno() {
		super();
	}

	public Aluno(Integer id, String nome, int matricula, Curso curso, float cr, EstadoCivil estadoCivil) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.cr = cr;
		this.estadoCivil = (estadoCivil==null) ? null : estadoCivil.getCod();
		this.curso = curso;
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
	

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}


}
