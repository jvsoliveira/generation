programa{
	
	funcao inicio(){
		inteiro vetor[5], cont, maior = 0

		para (cont = 0 ; cont < 5 ; cont++){

			escreva("Digite o " + (cont + 1) + "º número: ")
			leia(vetor[cont])
			
			se(maior < vetor[cont]){
				maior = vetor[cont]
			}
		}
		escreva("\nOs números do vetor são: " + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + " e " + vetor[4])
		escreva("\nO maior valor dentro deste vetor é " + maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */