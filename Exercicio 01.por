programa
{
	
	funcao inicio()
	{
		inteiro M, E, P, peso

		escreva("Insira o peso dos tomates: ")
		leia(P)
		peso=P%50
		M=peso*4
		se (P>50)
		 {
		 	escreva("Peso excedido. Você deverá pagar uma multa no valor de: R$",M) 		 	
		 	}
		senao 
		{
			escreva("Peso dentro do limite estabelecido")
			} 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */