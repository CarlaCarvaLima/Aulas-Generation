programa
{
	
	funcao inicio()
	{
		real numerador=-1, denominador = 0, divisao = 0, soma = 0

		para (denominador = 1; denominador <= 50; denominador++)
		{
   			 numerador = numerador + 2
   			 divisao = (numerador / denominador)
   			 soma = soma + divisao
   			 escreva("\n",numerador,"/",denominador," = ",divisao)
   			 escreva("\n", soma)
   			 
   		}
 				escreva("\n A soma total dos valores é de: ",soma)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */