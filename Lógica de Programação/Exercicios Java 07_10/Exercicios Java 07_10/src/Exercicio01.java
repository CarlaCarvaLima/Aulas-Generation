import java.util.*;

public class Exercicio01 {
	
	public static void main(String [] args)
	
	{
		 int num1;
	     int num2;
	     int num3;
	     
	     Scanner leia = new Scanner(System.in);

	    System.out.println("Digite o primeiro n�mero: ");
	    num1=leia.nextInt();

	    System.out.println("Digite o segundo n�mero: ");
	    num2=leia.nextInt();

	    System.out.println("Digite o terceiro n�mero: ");
	    num3=leia.nextInt();


	    // L�gica para descobrir o maior n�mero
	    
	    if (num1 > num2)
	    {
	        if(num1 > num3)
	        {
	            System.out.println("O maior numero �: " + num1);
	        }
	        else
	        {
	            System.out.println("\nO maior numero �: " + num3);
	        }
	    }
	    else
	    {
	        if(num2 > num3)
	        {
	            System.out.println("\nO maior numero �: " + num2);
	        }
	        else
	        {
	            System.out.println("\nO maior numero �: " + num3);
	        }
	    }
	}

}

