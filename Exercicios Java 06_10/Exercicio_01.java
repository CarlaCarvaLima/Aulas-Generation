import java.util.Scanner;

public class Exercicio_01 
{

	public static void main(String[] args)
	{
		short diasAno = 365;
		short diasMes = 30;
		short dias;
		short meses;
		short anos;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		System.out.print("Anos: ");
		anos = leitor.nextShort();
		
		System.out.print("Meses: ");
		meses = leitor.nextShort();
		
		System.out.print("Dias: ");
		dias = leitor.nextShort();
		
		dias += (anos*diasAno)+(meses*diasMes);
		
		System.out.println("\n\nA sua idade é de " + dias + " dias.");
	}


}

