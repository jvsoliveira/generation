package br.com.generation.heranca;

public class AnimalObj {

	public static void main(String[] args) {

	        Cavalo cav1 = new Cavalo();
	        Cachorro cac1 = new Cachorro();
	        Preguica pre1 = new Preguica();
	        
	        cac1.setNome("Bethoven");
	        cac1.setIdade(4);

	        cav1.setNome("Pé de Pano");
	        cav1.setIdade(7);

	        pre1.setNome("Cochilo");
	        pre1.setIdade(6);
	        
	        System.out.println("O cachorro chama " + cac1.getNome() + ".");
	        System.out.println("O cachorro tem " + cac1.getIdade() + " anos.");
	    	cac1.emitirSom("AU-AU-AU");
			cac1.corre();
	        System.out.println();

	        System.out.println("O cavalo chama " + cav1.getNome() + ".");
	        System.out.println("O cavalo tem " + cav1.getIdade() + " anos.");
	    	cav1.emitirSom("iiirrrrí");
			cav1.corre();
	        System.out.println();

	        System.out.println("A preguiça chama " + pre1.getNome() + ".");
	        System.out.println("A preguiça tem " + pre1.getIdade() + " anos.");
	    	pre1.emitirSom("Ahnn Ahnnn");
			pre1.subir();

	}

}
