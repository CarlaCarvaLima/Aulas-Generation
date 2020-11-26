import java.util.*;

public class Exercicio01 {
	
	public static void main(String [] args)
	
	{
		int n;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5 são: ");
		
		for (n =1000; n < 2000; n++){
			
		    if (n%11==5) {
		        System.out.println(n);
		    }
		    	
		}
	}

}
