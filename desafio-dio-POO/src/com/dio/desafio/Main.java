package com.dio.desafio;

import java.time.LocalDate;

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
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
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJonathan = new Dev();
		devJonathan.setNome("Jonathan");
		devJonathan.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos Jonathan:"+ devJonathan.getConteudosInscritos());
		
		devJonathan.progredir();
		devJonathan.progredir();
		System.out.println("---");
		
		System.out.println("Conteudos Inscritos Jonathan:"+ devJonathan.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Jonathan:"+ devJonathan.getConteudosConcluidos());
		System.out.println("XP: "+ devJonathan.calcularTotalXp());
		
		System.out.println("-------------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos João:"+ devJoao.getConteudosInscritos());
		
		devJoao.progredir();
		System.out.println("---");
		
		System.out.println("Conteudos Inscritos João:"+ devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Joao:"+ devJoao.getConteudosConcluidos());
		System.out.println("XP: "+ devJoao.calcularTotalXp());
		
	}

}
