package br.com.generation.exercvetmat;

import java.util.Scanner;
public class Exerc02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		double[] dado = new double[10];
		double maior = 0, vezes = 0;

		for(int i = 0; i < dado.length; i++) {	
			System.out.println("Digite o " + (i + 1) + "º número sorteado no dado de 6 faces: ");
			dado[i] = ler.nextDouble();		
			
			while(dado[i] < 1 || dado[i] > 6){
	   			System.out.println("Valor inválido.");
	   			System.out.println("Digite o " + (i + 1) + "º número sorteado no dado de 6 faces: ");
	   			dado[i] = ler.nextDouble();	
	        }
			if(maior < dado[i]) {
				maior = dado[i];
			}
		}
		for(int i = 0; i < dado.length; i++) {	
          	if(dado[i] == maior){
                vezes++;
           	}
		}
		System.out.println();
		for(int i = 0; i < dado.length; i++) {	
			System.out.print(dado[i] + " | ");
		}
		System.out.println();
		System.out.println("O maior número digitado é: " + maior);
		System.out.println("O maior valor foi repetido : " + vezes + " vezes");
		ler.close();
	}
}
