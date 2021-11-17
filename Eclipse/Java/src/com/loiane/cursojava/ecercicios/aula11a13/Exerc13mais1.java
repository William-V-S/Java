package com.loiane.cursojava.ecercicios.aula11a13;

import java.util.Scanner;

public class Exerc13mais1 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		
		System.out.println("Download");
		System.out.println("Qual o tamanho do arquivo(MB) e a velocidade de download(Mbps): ");
		
		double mb = scam.nextDouble();
		double mbps = scam.nextDouble();
		double tempo = (mb/mbps) *0.60;
		
		System.out.println("Tempo extimado: "+ tempo );
		
	}

}
