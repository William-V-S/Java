package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Digite 2 numeros (Inteiros): ");
		int num1 = scam.nextInt();
		int num2 = scam.nextInt();
		
		System.out.println("Digite 1 numero real: ");
		double real = scam.nextDouble();
		double num4 = num2;
		System.out.println("A: "+((num1*2)*(num4/2)));
		System.out.println("B: "+((num1*3)+real));
		System.out.println("C: "+ (real*real*real));

	}

}
