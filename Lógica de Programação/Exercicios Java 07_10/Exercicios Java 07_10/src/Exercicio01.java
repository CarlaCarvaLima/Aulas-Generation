import java.util.*;

public class Exercicio01 {
	
	public static void main(String [] args)
	
	{
		 int num1;
	     int num2;
	     int num3;
	     
	     Scanner leia = new Scanner(System.in);

	    System.out.println("Digite o primeiro número: ");
	    num1=leia.nextInt();

	    System.out.println("Digite o segundo número: ");
	    num2=leia.nextInt();

	    System.out.println("Digite o terceiro número: ");
	    num3=leia.nextInt();


	    // Lógica para descobrir o maior número
	    
	    if (num1 > num2)
	    {
	        if(num1 > num3)
	        {
	            System.out.println("O maior numero é: " + num1);
	        }
	        else
	        {
	            System.out.println("\nO maior numero é: " + num3);
	        }
	    }
	    else
	    {
	        if(num2 > num3)
	        {
	            System.out.println("\nO maior numero é: " + num2);
	        }
	        else
	        {
	            System.out.println("\nO maior numero é: " + num3);
	        }
	    }
	}

}

