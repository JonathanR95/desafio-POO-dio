package com.dio.desafio;

import java.time.LocalDate;

import com.dio.desafio.dominio.Conteudo;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso(); 
		
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso(); 
		
		curso2.setTitulo("curso Spring");
		curso2.setDescricao("descrição curso com Spring");
		curso2.setCargaHoraria(6);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

	
	}

}
