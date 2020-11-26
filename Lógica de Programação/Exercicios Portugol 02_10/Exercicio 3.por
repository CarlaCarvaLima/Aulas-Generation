programa
{
	
	funcao inicio()
	{
		inteiro intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0,foraIntervalo=0, x

			escreva("Digite um número inteiro: ")
			leia(x)

		enquanto(x>=0)
		{
			escreva("Digite um número inteiro: ")
			leia(x)

			se(x>=0 e x<=25)
			{
				intervalo1=intervalo1++
			}
			se(x>=26 e x<=50)
			{
				intervalo2=intervalo2++
			}
			se(x>=51 e x<=75)
			{
				intervalo3=intervalo3++
			}
			se(x>=76 e x<=100)
			{
				intervalo4=intervalo4++
			}
			se(x>100)
			{
				foraIntervalo=foraIntervalo++
			}
		}
		escreva("Quantidade de números que pertencem ao intervalo de 0-25: ",intervalo1)
		escreva("\nQuantidade de números que pertencem ao intervalo de 26-50: ",intervalo2)
		escreva("\nQuantidade de números que pertencem ao intervalo de 51-75: ",intervalo3)
		escreva("\nQuantidade de números que pertencem ao intervalo de 76-100: ",intervalo4)
		escreva("\nQuantidade de números que não pertencem aos intervalos: ",foraIntervalo)
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 966; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */