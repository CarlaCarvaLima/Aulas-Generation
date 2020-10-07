import java.util.*;

public class Exercicio04 {
	
public static void main(String [] args)
	
	{
		int num;
		int pot;
		double raiz;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		num=leia.nextInt();
		
		pot=(int) Math.pow(num,2);
		raiz=Math.sqrt(num);
		
		if(num%2==0)
		{
		System.out.println("O número " + num + " é par e sua raíz quadrada é: " + raiz);
		} else
		{
			System.out.println("O número " + num + " é ímpar e elevado ao quadrado é " + pot);
		}
		
	}

}
