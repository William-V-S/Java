package com.loiane.cursojava.aula36.exerc;

import java.util.Scanner;

public class Exerc002 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		Curso curso = new Curso();
		Aluno aluno = new Aluno();
		Aluno[] alunos = new Aluno[2];
		double[] notas = new double[4];
		double media = 0;
		String nomealuno;
		
		
		for (int i = 0; i < alunos.length; i++) {
			media = 0;
			System.out.println("Digite o nome do aluno: ");
			nomealuno = scam.next();
			
			System.out.println("Digete as notas do ");
			for (int j = 0; j < notas.length; j++) {
				notas[j] = scam.nextFloat();
				media += notas[j];
			}
			media/=4;
			Aluno a = new Aluno();
			a.setMedia(media);
			a.setNome(nomealuno);
			a.setNotas(notas);
			alunos[i] = a;

		}
		
		curso.setAlunos(alunos);
//		for (Aluno al : curso.getAlunos()) {
//			System.out.println();
//		}
//		System.out.println(aluno.getNome()+" "+aluno.getMedia());
		for (Aluno f : alunos) {
			System.out.println(f.getNome());
			System.out.println(f.getMedia());
		}
		for (Aluno f : curso.getAlunos()) {
			System.out.println("-------------------------------------");
			System.out.println(f.getNome());
			for (double g : aluno.getNotas()) {
				System.out.print(g+"	 ");
			}
		}
	}

}
