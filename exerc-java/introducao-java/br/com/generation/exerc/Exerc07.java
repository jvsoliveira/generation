package br.com.generation.exerc;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, f, e, x, y;

		System.out.println("Qual � o valor de a? ");
		a = leia.nextInt();
		
		System.out.println("Qual � o valor de b? ");
		b = leia.nextInt();
		
		System.out.println("Qual � o valor de c? ");
		c = leia.nextInt();
		
		System.out.println("Qual � o valor de d? ");
		d = leia.nextInt();
		
		System.out.println("Qual � o valor de e? ");
		e = leia.nextInt();
		
		System.out.println("Qual � o valor de f? ");
		f = leia.nextInt();
		
		System.out.println("Qual � o valor de a? ");
		a = leia.nextInt();
		
		x = ((c*e) - (b*f))/((a*e) - (b*d));
		y = ((a*f) - (c*d))/((a*e) - (b*d));
		
		System.out.println("O valor de X � " + x);
		System.out.println("O valor de Y � " + y);
		
		leia.close();
	}

}