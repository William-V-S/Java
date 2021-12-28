package com.loiane.cursojava.aula39.exerc;

public class Peixe extends Animal {

	private String caracteristicas ;
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Peixe() {
		super.setAmbiente("Mar");
		super.setCor("Cinza");
		super.setPata(0);
		this.caracteristicas ="barbatanas e cauda";
	}
	@Override
	public String toString() {
		String saida = super.toString();
		saida+= "\nCaracteristicas: "+caracteristicas;
		return saida;
	}
}
