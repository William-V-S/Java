package com.loiane.cursojava.exercicios14e15;

import java.util.Scanner;

public class exerc9 {

	public static void main(String[] args) {
		Scanner scamScanner = new Scanner(System.in);
		System.out.println("Digite 3 numero (inteiros): ");
		int num1 = scamScanner.nextInt();
		int num2 = scamScanner.nextInt();
		int num3 = scamScanner.nextInt();
		int primeiro = 0;
		int segundo = 0;
		int terceiro = 0;
		
		if ((num1 > num3) &&(num1>num2)){
			if (num2 > num3) {
					primeiro = num1;
					segundo = num2;
					terceiro = num3;
					
			}else {
				primeiro=num1;
				segundo=num3;
				terceiro=num2;
				
			}
		}else if ((num2 > num3) &&(num2>num1)) {
			if (num1 > num3) {
				primeiro=num2;
				segundo=num1;
				terceiro=num3;
				
			}else {
				primeiro=num2;
				segundo=num3;
				terceiro=num1;
				
			}
		}else {
			if (num1>num2) {
				primeiro=num3;
				segundo=num1;
				terceiro=num2;
				
			}else {
				primeiro=num3;
				segundo=num2;
				terceiro=num1;
				
			}
		}
		System.out.println(primeiro);
		System.out.println(segundo);
		System.out.println(terceiro);
		
	}

}
