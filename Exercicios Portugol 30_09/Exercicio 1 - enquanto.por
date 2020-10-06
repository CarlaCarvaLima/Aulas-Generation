programa
{
	
	funcao inicio()
	{
		real numero, somaNumero=0.0, mediaNumero, totalNumero=0.0

		escreva("Insira um número: ")
		leia(numero)

		enquanto(numero>=0)
		{
			somaNumero=somaNumero+numero
			totalNumero++
			escreva("Insira um número: ")
		     leia(numero)

		     
		}

		mediaNumero=somaNumero/totalNumero

		escreva("\nA soma dos números é de: ",somaNumero)
		escreva("\nO total de números inseridos é de: ",totalNumero)
		escreva("\nA média dos números inseridos é de: ",mediaNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */