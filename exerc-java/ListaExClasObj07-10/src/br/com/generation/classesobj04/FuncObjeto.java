package br.com.generation.classesobj04;

public class FuncObjeto {

	public static void main(String[] args) {
		FuncClasse c1 = new FuncClasse();	
		
		c1.setNome("José");
		c1.setFuncao("Gerente");
		c1.setSexo("Masculino");
		
		System.out.println(c1.getNome());
		System.out.println(c1.getFuncao());
		System.out.println(c1.getSexo());
		c1.atrasou();

	}

}
