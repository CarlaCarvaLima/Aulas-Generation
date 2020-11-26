programa
{
	
	funcao inicio()
	{
		inteiro n[5], x, maiorValor=0

		para(x=0;x<5;x++)
		
			{
				escreva("Digite o ",x+1,"º valor: ")
				leia(n[x])
			}
			
		limpa()
		
		para(x= 0;x<5;x++)
		
			{
				escreva("O ",x+1,"º valor foi de ",n[x],"\n")
				
				se(maiorValor<n[x])
				{
					maiorValor=n[x]
				}
			     
		}
		
		escreva("A maior valor foi: ", maiorValor)

	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */