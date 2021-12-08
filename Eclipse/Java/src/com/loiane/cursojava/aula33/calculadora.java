package com.loiane.cursojava.aula33;

public class calculadora {
	public int soma(int num1, int num2) {
		return num1+num2;
	}
	
	public int soma(int num1, int num2,int num3) {
		return num1+num2+num3;
	}
	
	public double soma(double num1, double num2) {
		return num1+num2;
	}
	
	public int some (int[] vetorinteiro) {
		int total = 0;
		
		for (int i =0 ; i < vetorinteiro.length; i++) {
			total += vetorinteiro[i];
		}
		return total;
	}
	
}
