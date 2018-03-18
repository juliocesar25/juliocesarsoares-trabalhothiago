package com.example.projetoCrud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoCrud.domain.Curso;
import com.example.projetoCrud.services.CursoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/cursos")

public class CursoResource {

	@Autowired
	private CursoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Curso> find(@PathVariable Integer id) {
		Curso obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Curso>> findAll() {
		List<Curso> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}