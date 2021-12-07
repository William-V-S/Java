package com.loiane.cursojava.aula29;

public class Carro {
	String marca;
	String modelo;
	int passageiros;
	double combustivel;
	double consumo;
	Carro() {
		System.out.println("A classe foi instanciada");
		passageiros = 5;
	}
	Carro (String marca_,	String modelo_, int passageiros_, double combustivel_, double consumo_){
		marca=marca_;
		modelo = modelo_;
		passageiros = passageiros_;
		combustivel=combustivel_;
		consumo=consumo_;
	}
	
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
