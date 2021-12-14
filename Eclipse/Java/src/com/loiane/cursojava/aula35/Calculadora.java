package com.loiane.cursojava.aula35;

public class Calculadora {
	public static int fatorialnr(int num) {
		int total = 1;
		while (num != 1) {
			total*=num;
			num--;
		}
		return total;
	}
	
	public static int fatorial(int num) {
		if (num ==0) {
			return 1;
		}
		return num* fatorial(num-1);
	}
}
