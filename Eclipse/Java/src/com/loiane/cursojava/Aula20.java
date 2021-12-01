package com.loiane.cursojava;

import java.util.Scanner;

public class Aula20 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		
		System.out.println("Entre com o numero de pessoas que serão entrevistada?");
		int entrevistados = scam.nextInt();
		
		String[][] nomesfilhos = new String[entrevistados][];
		for (int i = 0; i < nomesfilhos.length; i++) {
			System.out.println("Quantos filhos tem?");
			int filhos = scam.nextInt();
			
			nomesfilhos[i] = new String[filhos];
			
			for (int j = 0; j < nomesfilhos[i].length; j++) {
				System.out.println("Digite o nome do filho(a) " + (j+1));
				
				nomesfilhos[i][j] = scam.next();
			}
		}
		for (int i = 0; i < nomesfilhos.length; i++) {
			System.out.println("Pessoa "+(i+1)+" tem "+nomesfilhos[i].length +" filhos" );
			for (int j = 0; j < nomesfilhos[i].length; j++) {
				System.out.println(nomesfilhos[i][j]);
			}
		}
	}

}
