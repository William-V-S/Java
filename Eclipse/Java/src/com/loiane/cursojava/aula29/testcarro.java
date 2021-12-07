package com.loiane.cursojava.aula29;

public class testcarro {

	public static void main(String[] args) {
		Carro van= new Carro();
		van.marca = "Fiat";
		van.modelo= "Ducato";
		//van.passageiros= 10;
		van.combustivel = 100;
		van.consumo = 0.2;
		
		System.out.println(van.passageiros);
		Carro van2= new Carro("Vanbolada","Modelo", 10, 100, 0.2);
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.passageiros);
		System.out.println(van2.combustivel);
		System.out.println(van2.consumo);
	}

}
