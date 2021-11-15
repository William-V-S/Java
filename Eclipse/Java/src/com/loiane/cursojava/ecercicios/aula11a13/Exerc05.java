package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Conversor de metros para Centimetros");
		System.out.println("Quantos metros quer converter: ");
		double metro = scam.nextDouble();
		double cent = (metro*100);
		System.out.println("Da "+cent+"cm");
	}

}
