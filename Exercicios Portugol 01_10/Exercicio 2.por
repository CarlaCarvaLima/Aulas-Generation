programa
{
	
	funcao inicio()
	{
		inteiro somaNumero=0,numero[10],i,maiorNumero=0
		real mediaNumero,vezes

		para(i=0;i<10;i++)

		{
			escreva("Digite o número mostrado no dado: ")
			leia(numero[i])

			somaNumero=somaNumero+numero[i]

			se(maiorNumero==numero[i])

				{
					maiorNumero=maiorNumero++
				}

			para(i=0;i<10;i++)
			{
			se(maiorNumero==numero[i])

					{
						vezes=maiorNumero++
					}
			}
		}

		mediaNumero=somaNumero/10

		escreva("\nA média aritmética dos lançamentos é de: ",mediaNumero)
		escreva("\nO número maior: ",maiorNumero)
		escreva("\nO maior número apareceu: ",vezes,"vezes")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */