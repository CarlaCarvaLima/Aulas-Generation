import java.util.*;

public class Exercicio04 {
	
public static void main(String [] args)
	
	{
		int num;
		int pot;
		double raiz;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		num=leia.nextInt();
		
		pot=(int) Math.pow(num,2);
		raiz=Math.sqrt(num);
		
		if(num%2==0)
		{
		System.out.println("O n�mero " + num + " � par e sua ra�z quadrada �: " + raiz);
		} else
		{
			System.out.println("O n�mero " + num + " � �mpar e elevado ao quadrado � " + pot);
		}
		
	}

}
