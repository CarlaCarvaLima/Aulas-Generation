programa
{
	
	funcao inicio()
	{
		inteiro i, j, m[3][3], v[3];
		
 //captura os elementos do vetor
 
 escreva("Informe os elementos do vetor\n");
 para(i=0;i<3;i++)
 {
 escreva("Elemento: ",i);
 leia(v[i]);
 }
 
 //captura os elementos da matriz
 
 escreva("Informe os elementos da matriz\n");
 para(i=0;i<3;i++)
 {
 para(j=0;j<3;j++)
 {
 escreva("Elemento: ",i,j);
 leia(m[i][j]);
 }
 }
 
 //exibe valores originais
 
 escreva("\nValores Originais do Vetor\n");
 para(i=0;i<3;i++)
 {
 escreva(v[i]);
 escreva("\nValores Originais da Matriz\n");
 }
 para(i=0;i<3;i++)
 {	
 para(j=0;j<3;j++)
 escreva(m[i][j]);
 escreva("\n");
 }
 //multiplica vetor pelas colunas da matriz
 para(i=0;i<3;i++)
 para(j=0;j<3;j++)
 m[i][j]=v[i]*m[i][j];
 //exibe valores multiplicados
 escreva("\nValores Multiplicados\n");
 para(i=0;i<3;i++)
 {
 para(j=0;j<3;j++)
 escreva(m[i][j]);
 escreva("\n");
 }
 
}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 889; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */