package com.loiane.cursojava.exercicios19;

public class exerc32 {

	public static void main(String[] args) {
		int[] vetor = {3,4,8,12,13};
		for (int i : vetor) {
			for (int j=1; j<=10;j++) {
				System.out.println(i+" * "+j +"	= "+j*i);
			}
		}
	}

}
