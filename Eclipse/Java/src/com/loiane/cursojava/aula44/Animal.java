package com.loiane.cursojava.aula44;

public abstract class Animal {
	private String nome;
	
	public abstract void emitirsom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
