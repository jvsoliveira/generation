package ExercLacos;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[3];
	    for (int i = 0; i < vetor.length; i++) {
	    	System.out.println("Digite um número: ");
			vetor[i] = ler.nextInt();
	    }
	    System.out.println();
	    Arrays.sort(vetor);
        for (int i = 0; i < vetor.length; i++) {
	    	System.out.println(vetor[i]);
	    }
		ler.close();
	}
}