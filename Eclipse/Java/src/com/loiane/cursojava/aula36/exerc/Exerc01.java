package com.loiane.cursojava.aula36.exerc;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato contato = new Contato();
		Contato[] contatos = new Contato[3];
		
		System.out.println("Digite o nome da agenda: ");
		agenda.setNomeAgenda(scam.next());
		for (int i = 0; i < 3; i++) {
			Contato c = new Contato();
			System.out.println("Digite o nome do contato");
			c.setNome(scam.next());
			System.out.println("Digite o telefone do contato");
			c.setTelefone(scam.next());
			System.out.println("Digite o email do contato");
			c.setEmail(scam.next());
			
			contatos[i] = c;
		}
		agenda.setContato(contatos);
		
		if (agenda != null) {
			System.out.println(agenda.exibir());
			
		}
	}

}
