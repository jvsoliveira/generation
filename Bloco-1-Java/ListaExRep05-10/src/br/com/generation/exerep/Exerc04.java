package br.com.generation.exerep;
import java.util.Scanner;
public class Exerc04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pessoas = 0, idade, sexo, humor, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0;
			
		while(pessoas < 5) {		
		 System.out.println("Digite a idade: ");
		 idade = in.nextInt();
		 System.out.println("Digite o número do sexo [1]Feminino - [2]Masculino - [3]Outros : ");
		 sexo = in.nextInt();
		 System.out.println("Digite o estado mental [1]Calma - [2]Nervosa - [3]Agressiva: ");
		 humor = in.nextInt();
		 if(humor == 1) {
			 p1++;
		 }
		 if ((sexo == 1) && (humor == 2)) {
			 p2++;
		 }
		 if ((sexo == 2) && (humor == 3)) {
			 p3++;
		 }
		 if ((sexo == 3) && (humor == 1)) {
			 p4++;
		 }
		 if ((idade > 40) && (humor == 2)) {
			 p5++;
		 }
		 if ((idade < 18) && (humor == 1)) {
			 p6++;
		 }
		 pessoas++;
		}
		System.out.println("O número de pessoas calmas é " + p1);
		System.out.println("O número de mulheres nervosas é " + p2);
		System.out.println("O número de homens agressivos é " + p3);
		System.out.println("O número de outros calmos é " + p4);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é " + p5);
		System.out.println("O número de pessoas calmas com menos de 18 anos é " + p6);
		in.close();
	}
}