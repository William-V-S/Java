package com.loiane.cursojava.exercicios19;

public class exerc31 {

	public static void main(String[] args) {
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		for (int i = 1 ,j = 0; i <= 20; i++ ,j++) {
			vetorA[j] = i;
		}
		for (int i = 0 ,iimpar = 10,ipar =0; i < 20; i++) {			
			if (i%2 == 0) {
				vetorB[ipar] = vetorA[i];
				ipar++;
				
			}else {
				vetorB[iimpar] = vetorA[i];
				iimpar++;
			}
		}
		System.out.print("Vetor A: ");
		for (int i : vetorA) {System.out.print(i+"  ");}System.out.println("");
		System.out.print("Vetor B: ");
		for (int i : vetorB) {System.out.print(i+"  ");}System.out.println("");

	}

}
