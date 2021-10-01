package br.com.generation.exerc;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, d;

		System.out.println("Qual é o valor de x no ponto 1: ");
		x1 = leia.nextInt();
		
		System.out.println("Qual é o valor de y no ponto 1: ");
		y1 = leia.nextInt();
		
		System.out.println("Qual é o valor de x no ponto 2: ");
		x2 = leia.nextInt();
		
		System.out.println("Qual é o valor de y no ponto 2: ");
		y2 = leia.nextInt();
		
		d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("A distância entre o ponto 1 e 2 é de " + d);
		
		leia.close();
	}

}