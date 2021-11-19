package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Dobro da Area do Quadrado");
		System.out.println("Digite quanto tem o lado: ");
		double lado = scam.nextDouble();
		//double area = lado*lado;
		double area = Math.pow (lado,2);
		double dobro = area*2;
		System.out.println("Area: "+area);
		System.out.println("Dobro da area: "+dobro);
	}

}
