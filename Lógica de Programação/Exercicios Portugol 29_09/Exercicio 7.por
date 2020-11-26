programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real base, altura, area, somaQuadrados, quadradoBase, quadradoAltura

		escreva("Informe a medida da base: ")
		leia(base)
		escreva("Informe a medida da altura: ")
		leia(altura)
		se (base<=0)
		{
		escreva("Base invalida")
		} senao
		{
			escreva("\nBase valida")
		}
		
		se (altura<=0)
		{
		escreva("\nAltura invalida")
		} senao
		{
			escreva("\nAltura valida")
		}
		se (altura<=0 ou base<0)
		{
			limpa()
		} senao
		
		{
		quadradoBase=mat.potencia(base,2.0)
		quadradoAltura=mat.potencia(altura,2.0)		
		somaQuadrados= quadradoAltura+quadradoBase
		area=(mat.raiz(somaQuadrados, 2.0))
		escreva("\nA area do triangulo é: ",area)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 476; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */