programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
{
		inteiro valor, multValor = 0, cont = 0

			escreva("\nDigite um valor: ")
			leia(valor)

		enquanto (multValor <= 100){

			multValor = (valor * (mat.potencia(3, cont)))
			cont++

			escreva("\n" + multValor)	
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */