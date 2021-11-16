package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Conversor de Celsios para Farenheit");
		System.out.println("Graus celsius: ");
		double grausC = scam.nextDouble();
		double grausF = (grausC*9)/5+32;
		System.out.println("Graus Farenheit: " + grausF+" °F");

	}

}
