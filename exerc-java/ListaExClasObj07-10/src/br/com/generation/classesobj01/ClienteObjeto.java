package br.com.generation.classesobj01;

public class ClienteObjeto {

	public static void main(String[] args) {
		ClienteClasses c1 = new ClienteClasses();	
		
		c1.setNome("João");
		c1.setIdade(30);
		c1.setSexo("Masculino");
		
		c1.carrinho(40);
		
		System.out.println(c1.getNome());
		System.out.println(c1.getSexo());
		System.out.println(c1.getIdade() + " anos");
		System.out.println("O valor do carrinho é de " + c1.getTotalCarrinho() + " reais");
	}
}
