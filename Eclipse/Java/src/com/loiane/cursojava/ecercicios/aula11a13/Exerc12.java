package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		
		System.out.println("Peso ideal");
		System.out.println("Qual sua altura: ");
		double altura = scam.nextDouble();
		double pesoI = (72.7*altura)-58;
		
		System.out.println("Seu peso ideal seria: " + pesoI);

	}

}
