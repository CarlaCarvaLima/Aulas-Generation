programa
{
	
	funcao inicio()
	{
		inteiro i,cod, num[5]
 
    escreva("Mostrando números de um vetor na ordem direta ou ordem indireta:")
    para (i=0;i<=4;i++)
    {
        escreva("\nInforme o",i, "º número:")
        leia(num[i])
    }
        escreva("\nInforme um código para ler vetor:")
        escreva("\n“1 – ordem indireta.")
        escreva("\n“2 – ordem direta.")
        escreva("\n“Zero – finalizar programa.")
        leia(cod)
        
        se(cod == 0)
        {
            escreva("Você finalizou o programa")
        }
        se(cod == 1)
        		{
            		para (i=4;i>=0;i--)
            		{
                      escreva(num[i])
            	     }
               }
        se(cod == 2)
        {
            para (i=0;i<=4;i++)
            {
                escreva(num[i])
        	  }

    }
	se((cod < 0) ou (cod > 2))
	{
    		escreva("Código inválido")
}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */