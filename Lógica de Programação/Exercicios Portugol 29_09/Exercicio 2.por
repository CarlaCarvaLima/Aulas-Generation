programa
{
	
	funcao inicio()
	{
		inteiro N, salario, valorHorasExtras, horasExtras

		escreva("Insira o númmero de horas trabalhadas: ")
		leia(N)
		horasExtras=N%50
		valorHorasExtras=horasExtras*20
		salario=N*10
		se (N<=50)
		 {
		 	escreva("Seu salario é de: R$",salario) 		 	
		 	}
		senao 
		{
			escreva("Seu salario é de: R$",salario, " e suas horas extras são: R$",valorHorasExtras)
			} 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */