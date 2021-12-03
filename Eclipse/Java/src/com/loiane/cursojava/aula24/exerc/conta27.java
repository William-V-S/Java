package com.loiane.cursojava.aula24.exerc;

public class conta27 {
	String numconta;
	double saldo;
	boolean status;
	double limite;
	
	double obtersaque(double qtdsaque,double saldoatual) {
		double saque = 0;
		
		if (qtdsaque <= saldoatual) {
			saque = saldo-qtdsaque;
			saldo-=qtdsaque;
			System.out.println("Parabens voce sacou: R$"+qtdsaque);
			System.out.println("Saldo restante: R$:"+saldo);
		}else if (qtdsaque > saldoatual) {
			System.out.println("Quantidade em conta menor que o solicitado");
			
		}else {
			System.out.println("Nao funcionol");
		}
		return saque;
	}
	double adicionardinheiro(double dinheiro) {
		saldo += dinheiro;
		return saldo;
	}
	void exibirsaldo() {
		System.out.println("Conta: "+numconta);
		System.out.println("Saldo: R$"+saldo);
		System.out.println("");
	}
	
	
	
	
	
	
}

