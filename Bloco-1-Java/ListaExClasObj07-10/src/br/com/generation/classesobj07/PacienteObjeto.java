package br.com.generation.classesobj07;

public class PacienteObjeto {

	public static void main(String[] args) {
		PacienteClasse c1 = new PacienteClasse();	
		
		c1.setNome("João");
		c1.setPlano("Unimed");
		c1.setSexo("Masculino");
		
		System.out.println(c1.getNome());
		System.out.println(c1.getSexo());
		System.out.println(c1.getPlano());

		c1.exame();

	}

}
