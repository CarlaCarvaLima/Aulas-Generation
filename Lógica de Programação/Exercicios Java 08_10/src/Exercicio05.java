import java.util.*;

public class Exercicio05 {
	
	public static void main(String [] args){
		
		int n, contn=0,i;
		
		Scanner leia=new Scanner(System.in);
		do {
			System.out.println("Digite um número inteiro: ");
			n=leia.nextInt();
			
				contn=contn+n;
			
		}while(n!=0);
		
		System.out.println("Programa finalizado");
		System.out.println("A somatoria é: "+contn);
		
		
	}

}
