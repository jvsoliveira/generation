programa
{
	
	funcao inicio()
	{
		real A, B, C, D

		escreva("Insira o primeiro número: ")
		leia(A)

		escreva("Insira o segundo número: ")
		leia(B)

		escreva("Insira o terceiro número: ")
		leia(C)

		escreva("Insira o quarto número: ")
		leia(D)

		se((C * C) >= 1000){
			escreva("O resultado do quadrado do terceiro numero é : " + (C * C)) 
		} senao{
			escreva("O resultado dos quadrados dos números inseridos são: " + (A * A) + ", " + (B * B) + ", " + (C * C) + " e " + (D * D) + " respectivamente.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */