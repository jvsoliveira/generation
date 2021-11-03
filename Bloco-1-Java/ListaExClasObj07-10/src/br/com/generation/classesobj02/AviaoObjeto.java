package br.com.generation.classesobj02;

public class AviaoObjeto {

	public static void main(String[] args) {
		AviaoClasse c1 = new AviaoClasse();	
		
		c1.setMarca("Embraer");
		c1.setAno(2012);
		c1.setModelo("Monomotor");
		

		
		System.out.println(c1.getMarca());
		System.out.println(c1.getAno());
		System.out.println(c1.getModelo());
		c1.decolar();
		c1.pousar();
		
	}
}
