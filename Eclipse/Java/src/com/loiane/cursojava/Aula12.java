package com.loiane.cursojava;

import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = escanear.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu nome completo: ");
		String primeiroNome = escanear.nextLine();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite Sua Idade: ");
		int idade = escanear.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite Sua altura: ");
		double altura = escanear.nextDouble();
		System.out.println("Sua altura é: "+ altura);
	}

}
