package com.loiane.cursojava.aula24;

public class Testecarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo= "Ducato";
		van.passageiros= 10;
		van.combustivel = 100;
		van.consumo = 0.2;
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo= "Fusca";
		fusca.passageiros= 4;
		fusca.combustivel = 30;
		fusca.consumo = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);

	}

}
