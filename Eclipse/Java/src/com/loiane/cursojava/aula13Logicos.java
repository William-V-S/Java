package com.loiane.cursojava;

public class aula13Logicos {

	public static void main(String[] args) {
		int valor1= 5;
		int valor2= 6;

		boolean resultado = (valor1 ==5) && (valor2==6);
		System.out.println("Valor1 é 5 and valor2 é 6 resultado: "+resultado);
		
		boolean resultado2 = (valor1 ==5) || (valor2==6);
		System.out.println("Valor1 é 5 or valor2 é 6 resultado: "+resultado2);
		
		boolean verdade = true;
		boolean falso = false;
		System.out.println(verdade && falso);
		System.out.println(verdade || falso);
		System.out.println(verdade ^ falso);
		System.out.println(!verdade && falso);
	}

}
