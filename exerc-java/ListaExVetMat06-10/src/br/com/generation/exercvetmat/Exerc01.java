package br.com.generation.exercvetmat;
import java.util.Scanner;
public class Exerc01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		double[] pont = new double[5];
		double maior = 0;

		for(int i = 0; i < pont.length; i++) {	
			System.out.println("Digite a Pontua��o: ");
			pont[i] = ler.nextDouble();		
			if(maior < pont[i]) {
				maior = pont[i];
			}
		}
		System.out.println();
		for(int i = 0; i < pont.length; i++) {	
			System.out.print(pont[i] + " | ");
		}
		System.out.println();
		System.out.println("O maior n�mero digitado �: " + maior);
		ler.close();
	}
}

