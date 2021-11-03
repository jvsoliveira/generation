package ExercLacos;

import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {	
		Scanner ler = new Scanner(System.in);	
		int numero1, numero2, numero3, maior = 0;
		System.out.println("Digite o primeiro número:");
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo número:");
		numero2 = ler.nextInt();
		System.out.println("Digite o terceiro número:");
		numero3 = ler.nextInt();
		if(numero1 >= numero2 && numero1 >= numero3) {
			maior = numero1;
		} else if(numero2 > numero1 && numero2 >= numero3) {
			maior = numero2;
		} else if(numero3 > numero1 && numero3 > numero2) {	
			maior = numero3;
		}	
		System.out.println("Resultado: " + maior);		
		ler.close();
	}
}
