package com.loiane.cursojava.aula39;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;
	
	public void verificarnome() {
		this.nomeVisivel = "Funcionamesno";
		super.nomeVisivel = "Funfionol";
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia(){
		return 0;
	}
	
	public boolean verificarAprovado(){
		return true;
	}
}