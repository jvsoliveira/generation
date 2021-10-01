package br.com.generation.exerc;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, mes, dias, idade;

		System.out.println("Quantos anos você tem?");
		anos = leia.nextInt();
		
		System.out.println("Quantos meses já se passaram desde seu ultimo aniversário?");
		mes = leia.nextInt();

		System.out.println("Quantos dias já se passaram desde que você completou mais um mês de vida?");
		dias = leia.nextInt();
		
		idade = (anos * 365) + (mes * 30) + dias;
		
		System.out.println("Você tem " + idade + " dias de vida");
		
		leia.close();
	}

}
