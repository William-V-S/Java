package com.loiane.cursojava.aula39.exerc;

public abstract class  Animal {
	private String nome;
	private int comprimento;
	private int pata = 4 ;
	private String cor;
	private String ambiente;
	private float velocidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getPata() {
		return pata;
	}
	public void setPata(int pata) {
		this.pata = pata;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		String saida = "";
		saida += "Nome: "+ nome;
		saida += "\nComprimento: "+ comprimento+" cm";
		saida += "\nPata: "+ pata;
		saida += "\ncor: "+ cor;
		saida += "\nAmbiente: "+ ambiente;
		saida += "\nVelocidade: "+ velocidade +" m/s";

		return saida;
	}
	
}
