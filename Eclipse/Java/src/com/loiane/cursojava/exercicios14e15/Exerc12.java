package com.loiane.cursojava.exercicios14e15;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		Scanner scamScanner = new Scanner(System.in);
		System.out.println("Quantas horas trabalha por mes e quanto ganha por hora?");
		double horas = scamScanner.nextDouble();
		double ganha = scamScanner.nextDouble();
		double sbruto = horas*ganha;
		int IR = 0;
		
		if (sbruto<=900) {
			IR = 0;
		}else if (sbruto <=1500) {
			IR =5;
		}else if (sbruto <=2500) {
			IR =10;
		}else if (sbruto >2500) {
			IR =20;
		}
		double ir =  sbruto/100*IR;
		double INSS = sbruto/100*10;
		double FGTS = sbruto/100*11;
		double desconto = ir+INSS;
		
		System.out.println("Salario Bruto:("+horas+"*"+ganha+") : R$"+sbruto);
		System.out.println("IR ("+IR+"%) : R$"+ir);
		System.out.println("INSS (10%) : R$"+INSS);
		System.out.println("FGTS (11%) : R$"+FGTS);
		System.out.println("Total de desconto: R$"+desconto);
		System.out.println("Salario Liquido : R$"+(sbruto-desconto));
	}

}
