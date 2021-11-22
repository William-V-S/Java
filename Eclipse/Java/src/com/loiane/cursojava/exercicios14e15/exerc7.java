package com.loiane.cursojava.exercicios14e15;

import java.util.Scanner;

public class exerc7 {

	public static void main(String[] args) {
		Scanner scamScanner = new Scanner(System.in);
		System.out.println("Digite 3 numeros: ");
		double num1 = scamScanner.nextDouble();
		double num2 = scamScanner.nextDouble();
		double num3 = scamScanner.nextDouble();
		double maior = Math.max(num1, num2);
		maior = Math.max(maior, num3);
		double menor = Math.min(num1, num2);
		menor = Math.min(menor, num3);
		
		
		System.out.println("O maior numero é: "+maior);
		System.out.println("O menor numero é: "+menor);
	}

}
