import java.util.*;

public class Exercicio02 {
	public static void main(String[] args) {
		
		  int num, somaPares=0, i;
		  
		  List<Integer> numImpares = new ArrayList<>();
		  List<Integer> numPares = new ArrayList<>();

	       Scanner scanner = new Scanner(System.in);

	       for (i=0; i<6; i++){
	    	   
	    	   System.out.println("Digite um n�mero inteiro: ");
	           num = scanner.nextInt();  

	           if (num%2==0){
	               numPares.add(num);
	               somaPares += num;
	           }else{
	               numImpares.add(num);
	           }
	       }
	       System.out.println("Os n�meros pares digitados foram: " + numPares);
	       System.out.println("A soma dos n�meros pares �: " + somaPares);
	       System.out.println("Os n�meros �mpares digitados foram: " + numImpares);
	       System.out.println("A quantidade de n�meros �mpares digitados foi: " + numImpares.size());        
	   }
	}