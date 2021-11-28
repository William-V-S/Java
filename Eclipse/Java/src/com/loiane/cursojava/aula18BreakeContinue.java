package com.loiane.cursojava;

import java.util.Scanner;

public class aula18BreakeContinue {

	public static void main(String[] args) {
		/*Scanner scamScanner = new Scanner(System.in);
		System.out.println("Digite 2 numeros: ");
		int num = scamScanner.nextInt();
		int max = scamScanner.nextInt();
		
		for (int i = num; i < max; i++) {
			if (i % 7 ==0) {
				System.out.println("O valor de i é: "+i);
				break;
			}
		}*/
		
		Scanner scamScanner = new Scanner(System.in);
		System.out.println("Digite 2 numeros: ");
		int num = scamScanner.nextInt();
		int max = scamScanner.nextInt();
		
		for (int i = num; i <= max; i++) {
			if (i % 7 ==0) {
				continue;
			}
			System.out.println("O valor de i é: "+i);
		}	

	}

}
