package com.loiane.cursojava.aula34;

public class Calculadora {
	public int soma(int num1, int num2) {
		return num1+num2;
	}
	
	public static int soma(int num1, int num2,int num3) {
		return num1+num2+num3;
	}
	
	public static double soma(double num1, double num2) {
		return num1+num2;
	}
	
	public static int some (int[] vetorinteiro) {
		int total = 0;
		
		for (int i =0 ; i < vetorinteiro.length; i++) {
			total += vetorinteiro[i];
		}
		return total;
	}
	
	public static int fatorial(int num) {
		int total = 1;
		while (num != 1) {
			total*=num;
			num--;
		}
		return total;
	}
}
