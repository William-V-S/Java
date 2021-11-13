package com.loiane.cursojava.aula11;

public class Literais {
	public static void main(String[] args) {
		//Hexadecimais, Octais,Binarios
		int decval = 26;
		int hexval = 0x1a;
		int octval = 032;
		int binval = 0b11010 ; //JDK 7
		//todos são 26
		System.out.println("Numeros " + decval + hexval + octval + binval);
	}
}