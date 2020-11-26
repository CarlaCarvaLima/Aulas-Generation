import java.util.Scanner;

public class Exercicio_04 
{
	public static void main(String[]args)
	
	{
		double A;
		double B;
		double C;
		double D;
		double R;
		double R2;
		double S;
		double S2;
		
		Scanner leitor= new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		A=leitor.nextDouble();	
		System.out.print("Digite um valor para B: ");
		B=leitor.nextDouble();
		System.out.println("Digite um valor para C: ");
		C=leitor.nextDouble();
		R=(A+B);
		R2=Math.pow(R,2);
		S=(B+C);
		S2=Math.pow(S,2);
		D=((R2+S2)/2);
		System.out.println("O resultado de D é: "+ D);

	}

}


