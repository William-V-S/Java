package com.loiane.cursojava.exercicios14e15;

import java.util.Scanner;

public class Exerc23 {


	public static void main(String[] args) {
		Scanner scamScanner = new Scanner(System.in);
		System.out.println("				Até 5kg 	acima de 5kg");
		System.out.println("(1)File Duplo			R$4,90 por kg	R$5,80 por kg");
		System.out.println("(2)Alcata			R$5,90 por kg	R$6,80 por kg");
		System.out.println("(3)Picanha			R$6,90 por kg	R$7,80 por kg");
		System.out.println("Qual carne vai querer? Quantos kilos?");
		int opcao = scamScanner.nextInt();
		double kilos = scamScanner.nextDouble();
		System.out.println("Tem cartão para desconto?(1=S/2=N)");
		int cartao = scamScanner.nextInt();
		double carne = 0;
		boolean invalido = true;

		switch (opcao) {
		case 1:
		case 2:
		case 3:
			carne = opcao;
			
			if (kilos <= 5) {
				carne += 3.90;
			}else if (kilos>5) {
				carne += 4.80;
			}else {
				invalido = false;
			}break;
		default:invalido = false;break;
		}

		double desconto = 0;
		if (cartao == 1) {
			desconto = (carne*kilos)/100*5;
		}else if (cartao ==2) {
			desconto = 0;
		}
		double total = carne*kilos;
		double Totalpagar = total-desconto;
		if (invalido == true) {
			System.out.println("Quantidade de :	"+kilos+"kg");
			System.out.println("Preço por Kg: 	R$"+carne);
			System.out.println("Preço Total : 	R$"+total);
			System.out.println("Desconto: 	R$"+desconto);
			System.out.println("Total a pagar: 	R$"+Totalpagar);
	
		}else {
			System.out.println("Valores Invalidos");
		}
	}

}
