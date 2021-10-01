package br.com.generation.exerc;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idade, sobraAnos;

		System.out.println("Quantos dias de vida você tem?");
		idade = leia.nextInt();
			
		anos = (idade / 365);
		
		sobraAnos = (idade % 365);
		
		meses = (sobraAnos / 30);

		dias = (sobraAnos % 30);
		
		System.out.println("Sua idade é de " + anos + " anos " + meses + " meses e " + dias + " dias");
		
		leia.close();
	}

}