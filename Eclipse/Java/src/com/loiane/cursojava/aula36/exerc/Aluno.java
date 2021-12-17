package com.loiane.cursojava.aula36.exerc;

public class Aluno {
	private String nome;
	private String matricula;
	private double[] notas;
	private double media;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	
	public String exibirnotas() {
		return "1";
	}

	
	
}
