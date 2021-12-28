package com.loiane.cursojava.aula39.exerc;

public class test {

	public static void main(String[] args) {
		Animal camelo = new Mamifero();
		Animal tubarao = new Peixe();
		Mamifero urso = new Mamifero();
		Animal[] animais = new Animal[3];
		
		camelo.setNome("Camelo");
		camelo.setCor("Amarelo");
		camelo.setVelocidade(2);
		camelo.setComprimento(180);
		
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5f);

		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setCor("Vermelho");
		urso.setVelocidade(0.5f);
		urso.setAlimento("Mel");
		
		animais[0]=camelo;
		animais[1]=tubarao;
		animais[2]=urso;
		
		System.out.println("Zoo:");
		System.out.println("------------------------");
		for (Animal a : animais) {
			a.toString();
			System.out.println(a);
			System.out.println("------------------------");
		}

		
	}

}
