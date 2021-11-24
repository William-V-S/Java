package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Arrays;
import java.util.Random;

public class Exerc14 {

	public static void main(String[] args) {
//		joão esta procurando 5 produtos com valor em conta e um produto barato 
//		crie um algoritmo aleatorio que tera 50 posiçoes com valor maximo de 100 reais
//		Produto barato <= 20 reais 
//		Produto em conta <= 50 reais
//		Produto caro => 70 reais
		int[] produto = new int[50];
		int menor = 100;
		int fodase1 = 0;
		int fodase2 = 0;
		int fodase3 = 0;
		int fodase4 = 0;
		int fodase5 = 0;
		int cont = 0;

		Random aleatorioRandom = new Random();
		for (int i=0; i<50; i++) {
			produto[i] = aleatorioRandom.nextInt(100);
		}
		
		Arrays.sort(produto);
		for (int i:produto) {
			if (i < 20) {
				if (i < menor) {
					menor = i;
				}
			}else if (i <50) {
				if (cont < 5) {
					fodase5 = fodase4;
					fodase4 = fodase3;
					fodase3 = fodase2;
					fodase2 = fodase1;
					fodase1 = i;
					cont++;
				}
			}
		}

		for (int i:produto) {
			System.out.print(i+ "    ");
		}
		
		System.out.println(" ");
		System.out.println("Menor :"+menor);

		System.out.println("Em conta: "+fodase5);
		System.out.println("Em conta: "+fodase4);
		System.out.println("Em conta: "+fodase3);
		System.out.println("Em conta: "+fodase2);
		System.out.println("Em conta: "+fodase1);
		
	}

}
