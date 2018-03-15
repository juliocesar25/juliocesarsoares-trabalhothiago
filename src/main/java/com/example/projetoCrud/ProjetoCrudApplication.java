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
		Curso curso1 = new Curso(null, 20, "Sistema de informação");
		Curso curso2 = new Curso(null, 35, "Medicina");
		Curso curso3 = new Curso(null, 45, "Nutrição");
		Curso curso4 = new Curso(null, 55, "Engenharia Civil");
		repo.save(Arrays.asList(curso1,curso2,curso3,curso4));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Aluno aluno1 = new Aluno(null, "Kelvi Martins Ribeiro", 530333, null, curso1);		
		aluno1.setAnoNascimento(sdf.parse("26/06/1997"));		
		
		Aluno aluno2 = new Aluno(null, "Vinícius Souza", 603502, null, curso2);		
		aluno2.setAnoNascimento(sdf.parse("26/06/1995"));		

		Aluno aluno3 = new Aluno(null, "Marcelo Ramos", 703503, null, curso3);		
		aluno3.setAnoNascimento(sdf.parse("26/06/1960"));		

		Aluno aluno4 = new Aluno(null, "Thaís Almeida", 603503, null, curso2);		
		aluno4.setAnoNascimento(sdf.parse("29/10/1997"));		

		Aluno aluno5 = new Aluno(null, "Deivisson Martins", 803502, null, curso4);		
		aluno5.setAnoNascimento(sdf.parse("18/02/1996"));
		
		Aluno aluno6 = new Aluno(null, "Deivid Ribeiro", 803502, null, curso4);		
		aluno6.setAnoNascimento(sdf.parse("18/05/1990"));		
		
		
		repoAluno.save(Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5,aluno6));
	}
}
