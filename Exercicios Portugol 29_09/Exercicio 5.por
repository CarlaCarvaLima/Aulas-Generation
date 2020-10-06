programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Insira o indice de poluição: ")
		leia(indicePoluicao)

		se(indicePoluicao>=0.05 e indicePoluicao<=0.25)
		{
			escreva("Empresas estão liberadas")
		}
		senao se(indicePoluicao>0.25 e indicePoluicao<=0.3)
		{
			escreva("Notificar empresas primeiro grupo")
		}
		senao se(indicePoluicao>0.3 e indicePoluicao<=0.4)
	{
		escreva("Notificar empresas do primeiro e segundo grupo")
	}
	senao se(indicePoluicao>0.4 e indicePoluicao<=0.5)
	{
		escreva("Notificar empresas do primeiro, segundo e terceiro grupo")
	}
	senao
	{
		escreva("Valor invalido")	
	}
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */