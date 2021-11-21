package com.loiane.cursojava.exercicios14e15;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		Scanner scamScanner = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letraString = scamScanner.next();
		switch (letraString) {
		case "a":
		case "A":
		case "e":
		case "E":
		case "i":
		case "I":
		case "o":
		case "O":
		case "U": System.out.println("A letra digitada é uma Vogal");break;

		default:System.out.println("A letra digitada é uma consoante");break;
		}
	}

}
