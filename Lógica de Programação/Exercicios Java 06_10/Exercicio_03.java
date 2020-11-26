import java.util.Scanner;

public class Exercicio_03 

{	
		public static void main(String[] args)
		{
	
	int hora;
	int minuto;
	int segundos;
	int tempo;
	
	Scanner leitor= new Scanner(System.in);
	System.out.println("Digite o tempo em segundos: ");
	System.out.print("Segundos: ");
	
	tempo=leitor.nextInt();	
	
	
	 hora=(tempo/3600);
     minuto=(tempo%3600)/60;
     segundos=(tempo%60);
     System.out.println("\nO tempo é em horas, minutos e segundos: " + hora +" hora/horas "+ minuto +" minuto/minutos "+ segundos +" segundos");		

		}
}
		
		


