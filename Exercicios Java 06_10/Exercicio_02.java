import  java.util.Scanner;

public class Exercicio_02 

{
	public static void main(String[] args)
	
	{
		int ano;
		int mes;
		int dias;
		int diasTotais;
		
		Scanner leitor= new Scanner(System.in);
		
		System.out.println("Digite a sua idade em dias:");
		System.out.print("Dias: ");
		diasTotais=leitor. nextShort();
		
	     ano=(diasTotais/365);
	     mes=(diasTotais%365)/30;
	     dias=(diasTotais%30)-5;
	     System.out.println("\nA sua idade em anos, meses e dias é: " + ano +" ano/anos " + mes +" mes/meses " + dias +" dia/dias"); 			

	}

}

