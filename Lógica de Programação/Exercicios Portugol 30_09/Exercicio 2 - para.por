programa
{
	
	funcao inicio()
	{
		inteiro soma=0

		para(inteiro num=0; num<=500; num++)

		{
		se((num%3==0 e num%2==1) e (num>=1 e num<=500))
		{
			soma=soma+num
			escreva(soma,"\n")
			
		}
		}
		escreva("O somatorio: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 231; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */