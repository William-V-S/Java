package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Conversor de Farenheit para Celsius");
		System.out.println("Quantos graus Farenheit: ");
		double grausF = scam.nextDouble();
		double grausC = (5*(grausF-32)/9);
		System.out.println("Temperatura em Celsius "+ grausC + "°C");

	}

}
