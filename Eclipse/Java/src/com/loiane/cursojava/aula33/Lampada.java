package com.loiane.cursojava.aula33;

public class Lampada {
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoluz;
	private boolean tipoabajur;
	private boolean ligada;
	
	
	public Lampada() {	}
	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoluz, boolean tipoabajur,
			boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoluz = tipoluz;
		this.tipoabajur = tipoabajur;
		this.ligada = ligada;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoluz() {
		return tipoluz;
	}
	public void setTipoluz(String tipoluz) {
		this.tipoluz = tipoluz;
	}
	public boolean isTipoabajur() {
		return tipoabajur;
	}
	public void setTipoabajur(boolean tipoabajur) {
		this.tipoabajur = tipoabajur;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public void ligar() {
		setLigada(true);
	}
	public void desligar() {
		setLigada(false);
	}
	public void status() {
		if (ligada) {
			System.out.println("A lampada esta ligada");
		}else {
			System.out.println("A lampada esta desligada");
		}
	}
	public void mudarEstado() {
		if (isLigada()) {
			desligar();
		}else {
			ligar();
		}
	}
	
}
