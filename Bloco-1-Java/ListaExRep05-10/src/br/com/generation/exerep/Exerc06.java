package br.com.generation.exerep;

import java.util.Scanner;

public class Exerc06 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double soma = 0, contador = 0, numero;
	
		do {
			System.out.println("Digite um n�mero: ");
			numero = in.nextDouble();
			if((numero % 3 ==0) && (numero != 0)) {	
				soma += numero;
				contador++;
			}
		}
		while(numero != 0);
		System.out.println("A m�dia dos n�meros multiplos de 3 que foram digitados � " + (soma/contador));
		in.close();
	}
}