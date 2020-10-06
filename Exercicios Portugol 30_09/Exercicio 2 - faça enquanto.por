
programa
{
	
	funcao inicio()
	{
		inteiro n,soma=0
		
		escreva("Digite um número inteiro: ")
		leia(n)
		soma=soma+n
		escreva("\n Numero: ",n)
		faca
		{			
			se(n!=0 e n>=0)
			{
				n=(n-1)
			}
			escreva("\n Numero: ",n)
			soma=n+soma
		}
		enquanto(n>=0 e n!=0)
		escreva("\n Soma total é: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */