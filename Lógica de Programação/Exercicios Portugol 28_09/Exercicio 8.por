programa
{
	
	funcao inicio()
	{
		real custoFabrica, custoConsumidor, distribuidor, impostos

		escreva("Coloque o valor do custo da fabrica: R$ ")
		leia(custoFabrica)
		distribuidor=custoFabrica*0.28
		impostos=custoFabrica*0.45
		custoConsumidor=custoFabrica+distribuidor+impostos
		escreva("O custo para o consumidor será de: R$",custoConsumidor)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */