package com.loiane.cursojava.exercicios19;

public class exerc28 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		for (int i = 1 ,j = 0; i <= 20; i+=2 ,j++) {
			vetorA[j] += i;
		}
		for (int i = 9 ,j = 0; i >= 0; i-- ,j++) {
	//		System.out.println(i);
	//		System.out.println(j);
			
			vetorB[j] += vetorA[i];
		}
		for (int i : vetorA) {
			System.out.print(i+" ");
		}System.out.println("");
		for (int i : vetorB) {
			System.out.print(i+" ");
		}
		

	}

}
