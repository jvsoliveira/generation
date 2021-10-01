programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
			real x1, x2, y1, y2, d

			escreva("Qual é o valor de x no ponto 1: ")
			leia(x1)
			escreva("Qual é o valor de y no ponto 1: ")
			leia(y1)
			escreva("Qual é o valor de x no ponto 2: ")
			leia(x2)
			escreva("Qual é o valor de y no ponto 2: ")
			leia(y2)

			d = mat.raiz((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 2)

			escreva("A distância entre o ponto 1 e 2 é de " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */