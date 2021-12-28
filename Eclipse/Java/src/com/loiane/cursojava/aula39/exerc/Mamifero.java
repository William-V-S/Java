package com.loiane.cursojava.aula39.exerc;

public class Mamifero extends Animal {
	String Alimento;

	public String getAlimento() {
		return Alimento;
	}

	public void setAlimento(String alimento) {
		Alimento = alimento;
	}

	public Mamifero() {
		super.setAmbiente("Terra");
		
	}
	@Override
	public String toString() {
		String saida = super.toString();
		if (Alimento != null) {
			saida+= "\nAlimento: "+Alimento;			
		}
		return saida;
	}
	
}
