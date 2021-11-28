package com.loiane.cursojava;

import java.util.Iterator;

public class Aula19Arrays {

	public static void main(String[] args) {
		double[] temperaturas = new double[365];
		temperaturas[0] = 34.6;
		temperaturas[1] = 35.5;
		temperaturas[2] = 32.2;
		temperaturas[3] = 35.6;
		temperaturas[4] = 30;
		System.out.println("O tamanho do array: "+ temperaturas.length);
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia "+(i+1)+" é: "+temperaturas[i]);
		}
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
	}

}
