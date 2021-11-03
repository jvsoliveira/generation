package ExercLacos;

import java.util.Scanner;

public class Exerc03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;	
		System.out.println("Digite a idade do competidor: ");
		idade = ler.nextInt();
		if((idade >= 0) && (idade < 10)) {
			System.out.println("Muito jovem, volte com no mínimo 10 anos de idade!");	
		} else if((idade >= 10) && (idade <= 14)) {
			System.out.println("Você está na categoria 'Infatil'!");	
		} else if((idade >= 15) && (idade <= 17)) {
			System.out.println("Você está na categoria 'Juvenil'!");	
		} else if((idade >= 18) && (idade <= 25)) {
			System.out.println("Você está na categoria 'Adulto'!");
		} else if((idade > 25)) {
			System.out.println("Você está tem idade superior as categorias aceitas...");
		} else {
			System.out.println("Valor inserido incorreto.");
		}
		ler.close();
	}
}