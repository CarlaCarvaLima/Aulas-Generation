import java.util.*;
public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 int [][] matriz = new int[3][3];
		 int contagem = 0, coluna=0,linha=0;
		   
		    for(linha=0; linha<3; linha++){
		        for(coluna=0; coluna<3; coluna++){
		            System.out.printf( "Insira o valores da matriz:", linha+1, coluna+1);
		            matriz[linha][coluna]=entrada.nextInt();
		        }
		    }
		    for(linha=0; linha<3; linha++) {
		        for(coluna=0; coluna<3; coluna++) {
		            if(matriz[linha][coluna] > 10)
		                contagem++;
		            System.out.printf(" [%d] ",matriz[linha][coluna]);}  
		        System.out.println(" ");
		    }		 
		    System.out.println("\n\n Existem na matriz "+contagem+" números maiores que 10.");
	}
}
