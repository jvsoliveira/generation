programa
{
	
	funcao inicio()
	{
		real P, E, M

		escreva("Insira o peso do tomate em quilos: ")
		leia(P)

		se(P > 50){
			E = (P - 50)
			M = (E * 4)
		} 
		senao {
			E = 0
			M = 0
		}

		escreva("O valor do do Excesso é " + E + " quilos")
		escreva("\nO valor da Multa é de " + M + " reais")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */