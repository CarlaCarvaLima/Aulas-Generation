programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Insira um número: ")
		leia(numero)

		se(numero%2==0)
		{
			se(numero<0)
			{
			escreva("Esse número é par e negativo")
			} senao
			{
				escreva("Esse número é par e positivo")
			}
		}	senao
		{
			se(numero>0)
			{
				escreva("Numero impar e positivo")			}
			} senao
			{
				escreva("Numero impar e negativo")
			}
		}
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */