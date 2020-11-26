programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro filhos, somaFilhos=0, salarioDe100=0, i
		real salario, somaSalario=0.0, mediaSalario, mediaFilhos, maiorSalario=0.0,porcentagem

		para(i=1;i<=20;i++)
		{
			escreva("Informe o seu salario: R$")
			leia(salario)

			escreva("Informe o número de filhos: ")
			leia(filhos)

			//soma dos salarios

			somaSalario = somaSalario+salario

			// media filhos

			somaFilhos = somaFilhos+filhos

			// maior salario

			se(maiorSalario<salario)
			{
				maiorSalario=salario
			}

			se(salario<=100)
			{
				salarioDe100++
			}
		}

		// media salario

		mediaSalario = somaSalario/20

		// media filhos

		mediaFilhos = somaFilhos/20

		// cálculo percentual

		porcentagem=(salarioDe100*100)/20

		escreva("\nMédia salarial: R$",mediaSalario)
		escreva("\nMédia de filhos: ",mediaFilhos,"filhos")
		escreva("\nO maior salário é: R$",maiorSalario)
		escreva("\nA porcentagem da população que recebe até R$100,00 é: ",porcentagem,"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1003; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */