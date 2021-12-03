package com.loiane.cursojava.aula25;

public class Testando {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo= "Ducato";
		van.passageiros= 10;
		van.combustivel = 100;
		van.consumo = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirautonomia();
		double autonomia = van.obterautonomia();
		System.out.println("A Autonomia: "+autonomia);
		
		double qtdcombustivel10 = van.calcularcombustivel(10);
		double qtdcombustivel15 = van.calcularcombustivel(15);
		
		System.out.println("qtdcombustivel10: "+qtdcombustivel10);
		System.out.println("qtdcombustivel15: "+qtdcombustivel15);

	}

}
