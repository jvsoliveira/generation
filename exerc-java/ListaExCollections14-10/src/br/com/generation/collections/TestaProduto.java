package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		ArrayList<Produto> estoque = new ArrayList<>();
		
		int press = -1;
		
		estoque.add(new Produto("Ruffles", 1541));
		estoque.add(new Produto("Sabão em pó", 2562));
		estoque.add(new Produto("Picanha", 3865));
		estoque.add(new Produto("Margarina", 4123));
		
		while(press !=0) {
			
		System.out.println("VOCÊ DESEJA?\n\n[1]ADICIONAR PRODUTO \n[2]REMOVER PRODUTO \n[3]ATUALIZAR PRODUTO \n[0]SAIR" );
		press = sc.nextInt();
		
			if (press == 1) {
				System.out.println("Insira o nome do produto: ");			
				String produto = sc.next();
			
				System.out.println("Insira o nº de série do produto");
				int numSerie = sc.nextInt();
			
				System.out.println();
				estoque.add(new Produto(produto, numSerie));
				} 
		
			else if (press == 2) {
				System.out.println("Digite o número do item que deseja remover: ");
				int i = sc.nextInt();
				estoque.remove(i);
			
				} 
		
			else if (press == 3) {
				System.out.println("Digite o número do item que deseja atualizar: ");
				int i = sc.nextInt();
			
				System.out.println("Insira o nome do novo produto: ");
				String produto = sc.next();
			
				System.out.println("Insira o nº de série do produto: ");
				int numSerie = sc.nextInt();
			
				estoque.set(i, new Produto(produto, numSerie));			
			} 
		
			else {
			System.out.println("Tchau, até breve!!!");
			}
		
			for (int i = 0; i < estoque.size(); i++ ) {
			System.out.println(i + "|" + estoque.get(i));	
			System.out.println();
			}
		}
		sc.close();
	}
}


