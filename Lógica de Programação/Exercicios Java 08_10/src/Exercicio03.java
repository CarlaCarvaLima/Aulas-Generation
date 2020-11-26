import java.util.*;

public class Exercicio03 {
	
public static void main(String [] args)
	
	{
		int idade,contador21=0,contador50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Digite a idade (para encerrar, digite -99): ");
		idade=leia.nextInt();
		
		 while(idade!=-99){
			 
		 if(idade<21)
		 contador21++;
		 if(idade>50)
		 contador50++;
		 
		 System.out.println("\n Digite a idade (para encerrar, digite -99): ");
		 idade=leia.nextInt();
		 }
		 System.out.println("\n O total de pessoas com menos de 21 anos é: " + contador21);
		 System.out.println("\n O total de pessoas com mais de 50 anos: " + contador50);
	}

}
