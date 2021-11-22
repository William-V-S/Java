package com.loiane.cursojava.exercicios14e15;

import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		Scanner scamScanner = new Scanner(System.in);
		System.out.println("Digite sua nota(2): ");
		double nota1 = scamScanner.nextDouble();
		double nota2 = scamScanner.nextDouble();
		double media = (nota1+nota2)/2;
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		}else if (media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		System.out.println("Sua media: "+media);
	}

}
