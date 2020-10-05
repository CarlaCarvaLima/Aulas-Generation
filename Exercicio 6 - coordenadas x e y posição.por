programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real x1, x2, y1, y2, d, a, b, a2, b2, res
		escreva("Coordenada de x1: ")
		leia(x1)
		escreva("Coordenada de x2: ")
		leia(x2)
		escreva("Coordenada de y1: ")
		leia(y1)
		escreva("Coordenada de y2: ")
		leia(y2)
		a=x2-x1
		a2=mat.potencia(a,2.0)
		b=y2-y1
		b2=mat.potencia(b,2.0)
		res=a2+b2
		d=mat.raiz(res,2.0)
		escreva(" d = ",d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */