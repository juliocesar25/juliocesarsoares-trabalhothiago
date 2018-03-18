package com.example.projetoCrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetoCrud.domain.Curso;
import com.example.projetoCrud.repositories.CursoRepository;

@Service
public class CursoService {

	@Autowired
	CursoRepository repo;


	public Curso find(Integer id) {

		Curso obj = repo.findOne(id);
		return obj;

	}

	public List<Curso> findAll() {
		return repo.findAll();
	}	
}
