package br.com.generation.exercvetmat;

import java.util.Scanner;

public class Exerc03A {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double[][] N1 = new double[2][4];
		double[][] N2 = new double[2][4];
		double[][] M1 = new double[2][4];
		
		for(int l = 0; l < N1.length; l++) {
			for(int c = 0; c < N1[l].length; c++) {
				System.out.printf("Digite às notas: %d %d: ", l,c);		
				N1[l][c] = ler.nextDouble();
			}
		}
		for(int l = 0; l < N2.length; l++) {
			for(int c = 0; c < N2[l].length; c++) {
				System.out.printf("Digite às notas: %d %d: ", l,c);		
				N2[l][c] = ler.nextDouble();
			}
		}
		for(int l = 0; l < M1.length; l++) {
			for(int c = 0; c < M1[l].length; c++) {

				M1[l][c] = ((N1[l][c]) + (N2[l][c]));
			}
		}
		for(int l = 0; l < M1.length; l++) {
			for(int c =0; c < M1[l].length;c++) {
				System.out.printf(M1[l][c] + " ");
			}
			System.out.println();
		}
		ler.close();
	}

}

