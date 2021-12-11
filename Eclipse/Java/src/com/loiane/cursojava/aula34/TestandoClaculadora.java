package com.loiane.cursojava.aula34;

public class TestandoClaculadora {
	
	static double resultado;

	public static void main(String[] args) {
		
		//Calculadora calc = new Calculadora();
		//calc.soma(5, 4);
		resultado = Calculadora.soma(45.5, 45.9);
		
		soma3inteiros(45, 450, 230);
	}
	static int soma3inteiros(int num1, int num2,int num3) {
		return Calculadora.soma(num1, num2, num3);
	}

}
