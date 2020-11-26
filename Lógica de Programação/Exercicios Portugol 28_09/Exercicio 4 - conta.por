programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real A,B,C,D,R,S,R2,S2

		escreva("Digite um valor para A: ")
		leia(A)
		escreva("Digite um valor para B: ")
		leia(B)
		escreva("Digite um valor para C: ")
		leia(C)
		R=(A+B)
		R2=mat.potencia(R,2.0)
		S=(B+C)
		S2=mat.potencia(S,2.0)
		D=((R2+S2)/2)
		escreva("O resultado de D é: ", D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */