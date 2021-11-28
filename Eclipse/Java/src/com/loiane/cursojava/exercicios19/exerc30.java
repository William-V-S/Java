package com.loiane.cursojava.exercicios19;

public class exerc30 {

	public static void main(String[] args) {
		int[] vetorA = new int[20];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		for (int i = 1 ,j = 0; i <= 20; i++ ,j++) {
			vetorA[j] = i;
		}
		for (int i = 0 ,ib = 0,ic =0; i < 20; i++) {			
			if (i%2 == 0) {
				vetorC[ib] = vetorA[i];
				ib++;
				
			}else {
				vetorB[ic] = vetorA[i];
				ic++;
			}
		}
		
		System.out.print("Vetor A: ");
		for (int i : vetorA) {System.out.print(i+"  ");}System.out.println("");
		System.out.print("Vetor B: ");
		for (int i : vetorB) {System.out.print(i+"  ");}System.out.println("");
		System.out.print("Vetor C: ");
		for (int i : vetorC) {System.out.print(i+"  ");}
	}

}
