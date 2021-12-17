package com.loiane.cursojava.aula36.exerc;

public class Agenda {
	private String nomeAgenda;
	private Contato[] Contatos;
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public Contato[] getContato() {
		return Contatos;
	}
	public void setContato(Contato[] contato) {
		Contatos = contato;
	}
	
	public String exibir() {
		String info = "Nome: "+nomeAgenda+"\n";
		
		if (Contatos != null) {
			for (Contato con : Contatos) {
				info += con.exibir()+"\n";
			}
		}
		return info;
	}
	
	
}
