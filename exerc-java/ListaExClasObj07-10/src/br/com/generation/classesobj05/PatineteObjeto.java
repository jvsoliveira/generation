package br.com.generation.classesobj05;

public class PatineteObjeto {

	public static void main(String[] args) {
		PatineteClasse c1 = new PatineteClasse();	
		
		c1.setMarca("Oxelo");
		c1.setModelo("Com Motor");
		c1.setAno(2012);
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		System.out.println(c1.getAno());
		c1.andar();

	}

}
