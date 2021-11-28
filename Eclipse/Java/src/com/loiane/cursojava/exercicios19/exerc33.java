package com.loiane.cursojava.exercicios19;

public class exerc33 {

	public static void main(String[] args) {
		int[] numeros = {55,37,49,43,19,67,59,83,59,10 };
		int[] primo = new int [10];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 1; j < numeros[i]; j++) {
				if (numeros[i]%j == 0) {
					primo[i] +=1;
				}
			}
			System.out.print("O numero "+numeros[i]+" ");
			if (primo[i] == 1) {
				System.out.println("é primo");
			}else {
				System.out.println("não é primo");
				
			}
			
		}
	}

}
