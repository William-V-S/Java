package com.loiane.cursojava.exercicios14e15;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner scamScanner = new Scanner(System.in);
		System.out.println("Digite seu salario");
		double salario = scamScanner.nextDouble();
		int aumento = 0;
		if (salario <=280) {
			aumento = 20;
		}else if (salario <=700) {
			aumento = 15;
		}else if (salario < 1500) {
			aumento = 10;
		}else if (salario >=1500) {
			aumento = 5;	
		}else {
			System.out.println("Valor invalido");
		}
		double dinheiro = salario/100*aumento;
		double novosalario = salario + dinheiro;
		
		System.out.println("Seu salario: R$"+salario);
		System.out.println("Percentual de aumento: "+aumento+"%");
		System.out.println("Aumento: R$"+dinheiro);
		System.out.println("Seu novo salario: R$"+novosalario);
	}

}
