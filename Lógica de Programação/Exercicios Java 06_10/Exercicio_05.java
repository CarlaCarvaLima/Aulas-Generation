import java.util.Scanner;
import java.util.Scanner;

public class Exercicio_05 
{
		public static void main(String[]args)
		
		{
			
			double nota1;
			double nota2;
			double nota3;
			double media;
			
			Scanner leitor= new Scanner(System.in);
			
			System.out.print("Digite a nota 1: ");
			nota1=leitor.nextDouble();	
			System.out.print("Digite a nota 2: ");
			nota2=leitor.nextDouble();	
			System.out.print("Digite a nota 3: ");
			nota3=leitor.nextDouble();	
			
			media=((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
			System.out.println("A media ponderada é: " + media);

		}
		
		
	

}


