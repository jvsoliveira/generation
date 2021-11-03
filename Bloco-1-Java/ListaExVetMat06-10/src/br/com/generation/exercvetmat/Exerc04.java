package br.com.generation.exercvetmat;

import java.util.Scanner;

public class Exerc04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[][] matriz = new double[3][3];
		double soma = 0, diag = 0;
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Digite às notas: %d %d: ", l,c);		
				matriz[l][c] = ler.nextDouble();
			}
		}
		System.out.println();
		for(int l = 0; l < matriz.length; l++) {
			for(int c =0; c < matriz[l].length;c++) {
				System.out.printf(matriz[l][c] + " ");
			}
			System.out.println();
		}
		for(int l = 0; l < matriz.length; l++) {
			for(int c =0; c < matriz[l].length;c++) {
				
				soma += matriz[l][c];
				
				if (matriz[l] == matriz[c]) {
					diag += matriz[l][c];
				}
			}
		}
		System.out.println();
		System.out.println("A somatória é " + soma + ", ");
		System.out.println("A somatória da diagonal principal é " + diag);
		ler.close();
	}
}
