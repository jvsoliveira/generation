package br.com.generation.exerep;
import java.util.Scanner;
public class Exerc02 {
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		int impar=0, par=0;
	
		for(int numero, i = 0; i < 10; i++) {	
			 System.out.println("Digite um número: ");
			 numero = in.nextInt();
			 if(numero % 2 == 0) {
				 par++;
			 }else if(numero % 2 != 0) {
				 impar++;
			 }
		}
		System.out.println("Pares: " + par);
		System.out.println("Ímpares " + impar);
		in.close();
	}
}
