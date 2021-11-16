package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		
		System.out.println("Salario");
		System.out.println("Quanto ganha por hora e quantas horas trabalha por mes: ");
		double dinheiro = scam.nextDouble();
		int horas = scam.nextInt();
		double salario = dinheiro*horas;
		
		System.out.println("Total: R$"+salario);

	}

}
