programa{
	
	funcao inicio(){
		real indice

		escreva("Insira um índice de poluição medido: ")
		leia(indice)

		se( indice >= 0 e indice < 0.3){
			escreva("As indústrias pertencentes a todos os grupos podem operar normalmente.")
		}
		senao se( indice >= 0.3 e indice < 0.4){
			escreva("As indústrias pertencentes ao grupo 1 devem suspender suas atividades!")
		}
		senao se( indice >= 0.4 e indice < 0.5){
			escreva("As indústrias pertencentes ao grupo 1 e 2 devem suspender suas atividades!")
		}
		senao se( indice >= 0.5){
			escreva("As indústrias pertencentes ao grupo 1, 2 e 3 devem suspender suas atividades!")
		}
		senao{
			escreva("O índice informado não é válido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 126; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */