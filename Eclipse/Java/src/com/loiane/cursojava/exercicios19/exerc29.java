package com.loiane.cursojava.exercicios19;

public class exerc29 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20];
		for (int i = 1 ,j = 0; i <= 20; i+=2 ,j++) {
			vetorA[j] += i;
			vetorB[j] = i+70;
		}
		
		for (int i= 0, j =0 ; i<20;i++) {
			if (i < 10) {
				vetorC[i] = vetorA[i];
			}else {
				vetorC[i]=vetorB[j];
				j++;
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
