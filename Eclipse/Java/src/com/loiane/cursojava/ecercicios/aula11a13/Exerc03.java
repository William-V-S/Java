package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Digite 2 numeros: ");
		int num1 = scam.nextInt();
		int num2 = scam.nextInt();
		//int num3 = num1 + num2;
		//System.out.println("A Soma é "+ num3);
		System.out.println("A Soma é "+ (num1 + num2));
	}

}
