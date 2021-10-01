package br.com.generation.exerc;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor;

		System.out.println("Qual é o valor de fábrica deste carro? ");
		custoFabrica = leia.nextInt();
		
		custoConsumidor = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
		
		System.out.println("O custo deste carro ao consumidor é " + custoConsumidor);

		leia.close();
	}

}