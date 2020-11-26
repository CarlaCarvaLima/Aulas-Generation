import java.util.Scanner;

public class Exercicio_06 
{
	public static void main(String[]args)
	
	{
		
		double x1;
		double x2;
		double y1;
		double y2;
		double d;
		double a;
		double b;
		double a2;
		double b2;
		double res;
		
		Scanner leitor= new Scanner(System.in);
		
		System.out.print("Coordenada de x1: ");
		x1=leitor.nextDouble();
		System.out.print("Coordenada de x2: ");
		x2=leitor.nextDouble();
		System.out.print("Coordenada de y1: ");
		y1=leitor.nextDouble();
		System.out.print("Coordenada de y2: ");
		y2=leitor.nextDouble();
		a=x2-x1;
		a2=Math.pow(a,2);
		b=y2-y1;
		b2=Math.pow(b,2);
		res=a2+b2;
		d=Math.sqrt(res);
		System.out.println(" d = "+ Math.round(d));

	}

}

