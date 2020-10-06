programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4, quadradoN1, quadradoN2, quadradoN3, quadradoN4
		escreva("Digite o primeiro numero: ")
		leia(n1)
		escreva("Digite o segundo numero: ")
		leia(n2)
		escreva("Digite o terceiro numero: ")
		leia(n3)
		escreva("Digite o quarto numero: ")
		leia(n4)
		quadradoN1=mat.potencia(n1,2.0)
		quadradoN2=mat.potencia(n2,2.0)
		quadradoN3=mat.potencia(n3,2.0)
		quadradoN4=mat.potencia(n4,2.0)
		se (quadradoN3>=1000)
		{
			escreva("O valor do quadrado de n3 é: ",quadradoN3)
		}

		senao 
		{
			escreva("Os quadrados dos demais numeros são: ", quadradoN1,",", quadradoN2,",", quadradoN4)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 662; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */