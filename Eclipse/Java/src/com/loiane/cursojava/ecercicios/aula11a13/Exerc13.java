package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		
		System.out.println("Salario");
		System.out.println("Quanto ganha por hora e quantas horas trabalha por mes: ");
		double dinheiro = scam.nextDouble();
		int horas = scam.nextInt();
		double salario = dinheiro*horas;
		double imposto = salario/100 * 11;
		double INSS = salario/100 * 8;
		double sindicado = salario/100 * 5;
		double salarioliquido = salario-imposto-INSS-sindicado;
		
		System.out.println("Salario Bruto: R$"+salario);
		System.out.println("Imposto: R$"+imposto);
		System.out.println("INSS: R$"+INSS);
		System.out.println("Sindicado: R$"+sindicado);
		System.out.println("Salario Liquido: R$"+salarioliquido);
		

	}

}
