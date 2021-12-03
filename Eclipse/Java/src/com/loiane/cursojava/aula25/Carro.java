package com.loiane.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int passageiros;
	double combustivel;
	double consumo;
	
	void exibirautonomia() {
		
		System.out.println("A autonomia do carro é: "+combustivel*consumo+" Km");
	}
	double obterautonomia() {
		
		return combustivel*consumo;
	}
	double calcularcombustivel(double km) {
		double qtdcombustivel= km/consumo;
		return qtdcombustivel;
	}
}
