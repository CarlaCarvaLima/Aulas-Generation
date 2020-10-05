programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real preco, calculaPagamento, forma1, forma2, forma3, forma4, valor4
		inteiro pagamento

		escreva("Digite o preço do produto: R$")
		leia(preco)
		escreva("Digite a forma de pagamento:1,2,3 ou 4 -> ")
		leia(pagamento)

		limpa()

		forma1=preco-(preco*0.20)
		forma2=preco-(preco*0.15)
		forma3=preco/2
		valor4=preco+(preco*0.10)
		forma4=(valor4)/3

		escolha(pagamento)
		{
			caso 1:
				escreva("\nPagamento em dinheiro/cheque.O total a ser pago é de: R$ ",forma1)
				pare

			caso 2:
				escreva("\nPagamento no cartão de crédito. O total a ser pago é de: R$ ",forma2)
				pare

			caso 3:
				escreva("\nPagamento em 2x. O total a ser pago é de: R$ ",preco," em duas parcelas de R$ ",forma3)
				pare

			caso 4: 
				escreva("\nPagamento em 3x. O total a ser pago é de: R$ ",valor4," em três parcelas de R$ ",forma4)
				pare			
		}

		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */