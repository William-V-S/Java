package com.loiane.cursojava.aula34;

public class Contador {

	private static int cont;

	public static int getCont(int num) {
		return cont=num;
	}

	public static void setCont(int cont) {
		Contador.cont = cont;
	}
	
	public static void incrementa(int num) {
		getCont(cont+num);
	}
	public static void decremento(int num) {
		getCont(cont-num);
	}
	public static void zerar( ) {
		setCont(0);
	}
	public static void mostra() {
		System.out.println("O cantador esta em: "+cont);
	}
	
}
