package com.loiane.cursojava.exercicios19;

public class exerc36 {

	public static void main(String[] args) {
		int[] vetorA = new int[11];
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = 2<<i;
		}
		for(int i:vetorA) {
			System.out.println(i);
		}

	}

}
