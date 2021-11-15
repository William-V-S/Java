package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Calculo da Area do Circulo");
		System.out.println("Digite o raio:");
		double raio = scam.nextDouble();
		double area = (raio*raio)*3.14;
		System.out.println("Sua area é: "+ area+" m²");
	}

}
