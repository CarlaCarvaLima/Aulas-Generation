import java.util.*;

public class Exercicio02 {
	
public static void main(String [] args)
	{
	int par=0, num, i; 
	
	Scanner leia = new Scanner(System.in);

	for (i=1; i<=10; i++) { 

	System.out.println("Informe um número: ");
	num=leia.nextInt();

	if (num%2==0) { 
	par=par+1; 
	}
	}

	System.out.println("Pares:"+ par); 
	System.out.println("Impares: "+ (10-par)); 
	}

}
