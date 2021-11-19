package com.loiane.cursojava;

import java.util.Scanner;

public class Aula15 {

	public static void main(String[] args) {
		Scanner scamScanner = new Scanner(System.in);
		System.out.println("Entre com um dia da semana(1-7): ");
		int diadasemana = scamScanner.nextInt();
		switch (diadasemana) {
		case 1:
		case 7:System.out.println("Fim de semana");break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:System.out.println("Dia util");break;
		default:System.out.println("Não é um dia valido");break;
		}

	}

}
