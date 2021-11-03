package br.com.generation.classesobj06;

public class ContaObjeto {

	public static void main(String[] args) {
		ContaClasse c1 = new ContaClasse();	
		
		c1.setNome("José");
		c1.setConta(252805);
		c1.setSaldo(3200);
		
		System.out.println(c1.getNome());
		System.out.println(c1.getConta());
		System.out.println(c1.getSaldo() + " reais");
		
		c1.debito(280);
	
		System.out.println("O saldo desta conta é de " + c1.getSaldo() + " reais");

	}

}
