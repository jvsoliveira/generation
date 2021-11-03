package br.com.generation.exerep;
import java.util.Scanner;
public class Exerc03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = -1, ate21 = 0, mais50 = 0;
			
		while(numero !=-99) {		
		 System.out.println("Digite uma idade: ");
		 numero = in.nextInt();
		 if(numero >= 0 && numero < 21) {
			 ate21++;
		 }
		 else if (numero > 50) {
			 mais50++;
		 }
		}
		System.out.println("Pessoas com menos de 21 anos: " + ate21);
		System.out.println("Pessoas com mais de 50 anos: " + mais50);
		in.close();
	}
}
