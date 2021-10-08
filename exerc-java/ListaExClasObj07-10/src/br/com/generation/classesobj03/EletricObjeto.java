package br.com.generation.classesobj03;

public class EletricObjeto {

	public static void main(String[] args) {
		EletricClasse c1 = new EletricClasse();	
		
		c1.setMarca("Toshiba");
		c1.setTipo("Televisão");
		c1.setPreco(1500);
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getTipo());
		System.out.println(c1.getPreco() + " reais");
		
		c1.desconto(40);
	
		System.out.println("Com desconto, o valor será " + c1.getPreco() + " reais");

	}

}
