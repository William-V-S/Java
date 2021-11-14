package com.loiane.cursojava;

public class CurtoCircuito {

	public static void main(String[] args) {
		boolean verdade = true;
		boolean falso = false;
		boolean resultado1 = falso &
				verdade;
		boolean resultado2 = falso &&
				verdade;
		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
