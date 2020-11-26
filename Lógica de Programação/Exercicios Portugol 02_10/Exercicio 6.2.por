programa
{
	
	funcao inicio()
	{
		inteiro vetor[3], matriz[3][3], i, j

		para(i=0;i<3;i++)
		{
			escreva("Vetor: ")
			leia(vetor[i])
		}

		para(i=0;i<3;i++)
		{
			para(j=0;j<3;j++)
			{
				escreva("Matriz: ")
				leia(matriz[i][j])
				matriz[i][j]=vetor[j]*matriz[i][j]
				
			}
		}
		para(i=0;i<3;i++)
		{
			para(j=0;j<3;j++)
			{
				escreva("\nMatriz modificada ",matriz[i][j])
			}
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */