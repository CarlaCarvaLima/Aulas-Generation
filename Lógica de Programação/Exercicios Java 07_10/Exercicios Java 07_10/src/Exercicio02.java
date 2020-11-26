import java.util.*;

public class Exercicio02 {
	
public static void main(String [] args)
	
	{
	 int n1, n2, n3;  
	 
	 Scanner leia = new Scanner(System.in);
	  
	  System.out.println("Digite três numeros: ");
	  n1=leia.nextInt();
	  n2=leia.nextInt();
	  n3=leia.nextInt();
	  
	  if (n3 > n1)
	    if (n1 > n2)
	      System.out.println("A ordem crescente é: "+ n2 +" "+ n1+" " + n3);
	    else if (n2 < n3)
	      System.out.println("A ordem crescente é: "+ n1 +" "+ n2 +" "+ n3);
	  if (n1 > n2)
	    if (n2 > n3)
	      System.out.println("A ordem crescente é: "+ n3 +" "+ n2 +" "+ n1);
	    else if (n3 < n1)
	      System.out.println("A ordem crescente é: "+ n2 +" "+ n3 +" "+ n1);
	  if (n1 < n2)
	    if (n3 < n1)
	      System.out.println("A ordem crescente é: "+ n3 +" "+ n3 +" "+ n2);
	    else if (n3 < n2)
	      System.out.println("A ordem crescente é: "+ n1 +" "+ n3 +" "+ n2);
	}

}
