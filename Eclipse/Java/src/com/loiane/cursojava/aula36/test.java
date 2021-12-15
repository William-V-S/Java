package com.loiane.cursojava.aula36;

public class test {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Saraiva");
//		contato.setEndereco("New york");
//		contato.setTelefone("54 999999-9999");
		
		Endereco ende = new Endereco();
		ende.setNomeRua("Rua Antonio manoel Rodolfo");
		ende.setNumero("n/a");
		ende.setComplemento("-");
		ende.setCidade("Churubim");
		ende.setEstado("Amapoas");
		ende.setCep("999999-000");
		
		contato.setEndereco(ende);
		
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("54");
		telefone.setNumero("999999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("61");
		telefone2.setNumero("000000-9889");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
//		contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		if (contato != null && contato.getEndereco() !=null) {
			System.out.println(contato.getEndereco().getCidade());
			
		}
		
		/*if (contato != null && contato.getTelefone() !=null) {
			System.out.println(contato.getTelefone().getDdd()+" "+ contato.getTelefone().getNumero());
			
		}*/
		if ( contato != null && contato.getTelefones() != null) {
			for (int i = 0; i < telefones.length; i++) {
				System.out.println(telefones[i].getDdd() +" "+ telefones[i].getNumero());
			}
		}
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd()+" "+ t.getNumero());
			}
		}
	}

}
