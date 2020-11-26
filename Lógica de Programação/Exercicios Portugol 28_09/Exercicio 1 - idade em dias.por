programa
{
	
	funcao inicio()
	{
		real anos,mes,dias,res,diasAnos,diasMes
				
		escreva("\nDigite quantos anos você tem: ")
		leia(anos)
		escreva("\nDigite quantos meses você tem: ")
		leia(mes)
		escreva("\nDigite quantos dias você tem: ")
		leia(dias)
		diasAnos=anos*365
		diasMes=mes*30
		res=diasAnos+diasMes+dias
		escreva("\nVocê tem: ",res," dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */