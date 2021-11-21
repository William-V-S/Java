package com.loiane.cursojava.exercicios14e15;

import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Digite F ou M ");
		String sexo = scam.next();
		
		switch (sexo) {
		case ("F"):
		case "f":
			System.out.println("Seu sexo é Feminino");break;
		case "M":
		case "m":
			System.out.println("Seu sexo é Masculino");break;
		default:
			System.out.println("Sexo Invalido");break;
		}

	}

}
