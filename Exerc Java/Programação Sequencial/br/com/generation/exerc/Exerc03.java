package br.com.generation.exerc;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int horas, minutos, segundos, sobraHoras, tempo;

		System.out.println("Insira o tempo do evento em segundos: ");
		tempo = leia.nextInt();
			
		horas = (tempo / 3600);
		
		sobraHoras = (tempo % 3600);
		
		minutos = (sobraHoras / 60);

		segundos = (sobraHoras % 60);
		
		System.out.println("O tempo de dura��o do evento em horas � de " + horas + "h " + minutos + "min " + segundos + "s");
	
		leia.close();
	}

}
