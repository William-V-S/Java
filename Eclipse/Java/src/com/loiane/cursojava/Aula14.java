package com.loiane.cursojava;

import java.util.Scanner;

public class Aula14 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		/*System.out.println("Sua Idade: ");
		int idade = scam.nextInt();
		if (idade >= 18) {
			System.out.println("Voce é maior de idade");
		}else {
			System.out.println("Voce é menor de idade");
		}
		*/
		
		System.out.println("Entre com o preço do item: ");
		double valor = scam.nextDouble();
		
		if (valor <=10) {
			System.out.println("Ta barato, Pode compra");
		}else if (valor >10 && valor < 15) {
			System.out.println("Voce pode pefir um desconto");
		} else if(valor >=15 && valor <20){
			System.out.println("Pode pesquisar mais");
		}else {
			System.out.println("Muito caro");
		}
	}

}
