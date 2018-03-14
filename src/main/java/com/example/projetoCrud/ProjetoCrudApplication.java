package com.example.projetoCrud;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projetoCrud.domain.Aluno;
import com.example.projetoCrud.domain.Curso;
import com.example.projetoCrud.repositories.AlunoRepository;
import com.example.projetoCrud.repositories.CursoRepository;

@SpringBootApplication
public class ProjetoCrudApplication implements CommandLineRunner {
	@Autowired
	CursoRepository repo;
	
	@Autowired
	AlunoRepository repoAluno;
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetoCrudApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		Curso curso1 = new Curso(null, 53, "Sistema de informação");
		Curso curso2 = new Curso(null, 50, "Serviço Social");
		repo.save(Arrays.asList(curso1,curso2));
		
		Aluno aluno = new Aluno(null, "Kelvi Martins Ribeiro", 530333, null, curso1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		aluno.setAnoNascimento(sdf.parse("26/06/1997"));
		repoAluno.save(aluno);
	}
}
