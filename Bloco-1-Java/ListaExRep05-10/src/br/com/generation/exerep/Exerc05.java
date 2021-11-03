package br.com.generation.exerep;
import java.util.Scanner;
public class Exerc05 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int soma = 0, numero;
	
		do {
			System.out.println("Digite um número: ");
			numero = in.nextInt();
			soma += numero;
		}
		while(numero != 0);
		System.out.println("A soma dos números digitados é: " + soma);
		in.close();
	}
}
