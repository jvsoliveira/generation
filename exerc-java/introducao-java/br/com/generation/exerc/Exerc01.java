package br.com.generation.exerc;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, mes, dias, idade;

		System.out.println("Quantos anos voc� tem?");
		anos = leia.nextInt();
		
		System.out.println("Quantos meses j� se passaram desde seu ultimo anivers�rio?");
		mes = leia.nextInt();

		System.out.println("Quantos dias j� se passaram desde que voc� completou mais um m�s de vida?");
		dias = leia.nextInt();
		
		idade = (anos * 365) + (mes * 30) + dias;
		
		System.out.println("Voc� tem " + idade + " dias de vida");
		
		leia.close();
	}

}
