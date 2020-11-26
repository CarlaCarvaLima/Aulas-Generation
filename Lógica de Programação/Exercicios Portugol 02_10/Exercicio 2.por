programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real peso, altura, calculaImc

		escreva("Digite a sua altura: ")
		leia(altura)
		escreva("Digite o seu peso: ")
		leia(peso)

		//calculo IMC

		calculaImc=peso/(altura*altura)

		escreva("O seu IMC é de: ",mat.arredondar(calculaImc,2))

		se(calculaImc<18.5)
		{
			escreva("\nVocê está abaixo do peso")
		}
		senao se(calculaImc>=25 e calculaImc<30)
		{
			escreva("\nVocê está acima do peso")
		}
		senao se(calculaImc>=18.5 e calculaImc<25)
		{
			escreva("\nVocê está dentro do peso ideal")
		}
		senao se(calculaImc>30)
		{
			escreva("\nVocê está obeso")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 617; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */