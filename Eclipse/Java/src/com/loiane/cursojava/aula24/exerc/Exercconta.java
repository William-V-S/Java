package com.loiane.cursojava.aula24.exerc;

import java.util.Scanner;

public class Exercconta {

	public static void main(String[] args) {
		conta27 conta = new conta27();
		conta.numconta = "756.487.784-47";
		conta.saldo= 25.41;
		conta.status = true;
		int resposta = 1;
		double dinheiro;
		
		Scanner scam = new Scanner(System.in);
		while (resposta!=4) {	
			System.out.println("Escolha as opçoes");
			System.out.println("1 - Exibir Saldo");
			System.out.println("2 - Adicionar Saldo");
			System.out.println("3 - Sacar");
			System.out.println("4 - Sair");
			resposta = scam.nextInt();
			switch (resposta) {
				case 1:conta.exibirsaldo();;break;
				case 2:
					System.out.println("Quanto gostaria de depositar? ");
					dinheiro = scam.nextDouble();
					conta.adicionardinheiro(dinheiro);break;
				case 3:
					System.out.println("Quanto gostaria de Sacar? ");
					dinheiro = scam.nextDouble();
					conta.obtersaque(dinheiro,conta.saldo);break;
				case 4:System.out.println("Tenha um bom dia!!");break;
				default:System.out.println("Escolha Invalida");;break;
			}
			

		}
	}

}
