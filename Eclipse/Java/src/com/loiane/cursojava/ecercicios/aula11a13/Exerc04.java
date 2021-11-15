package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Digite suas notas(4): ");
		double nota1 = scam.nextDouble();
		double nota2 = scam.nextDouble();
		double nota3 = scam.nextDouble();
		double nota4 = scam.nextDouble();
		double media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Sua media é: "+media);

	}

}
