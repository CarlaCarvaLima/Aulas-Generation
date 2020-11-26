import java.util.*;

public class Exercicio04 {

	public static void main(String [] args)
	
	{
		int idade,i=1,genero,temperamento,pescalm18=0,homagress=0,contpecalm=0,pesnaobincalm=0,nummulnerv=0,pesnerv40=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(i<=3) {
					
			System.out.println("Digite a idade: ");
			idade=leia.nextInt();
			
			System.out.println("\nInforme o genero: \n1-Feminino \n2-Masculino \n3-NãoBinarie ");
			genero=leia.nextInt();
			
			System.out.println("\nTemperamento: \n1-Calmo(a/e) \n2-Nervoso(a/e) \n3-Agressivo(a/e)");
			temperamento=leia.nextInt();
			
			switch (temperamento) {
			   case 1:
			           contpecalm++;
			           if(idade<=18)
			        	   pescalm18++;
			           if(genero==3)
			        	   pesnaobincalm++;
			           break;
			   case 2:
				   if(idade>=40)
		        	   pesnerv40++;
		           if(genero==1)
		        	   nummulnerv++;
			           break;
			   case 3:
			           if(genero==1)
			        	   homagress++;
			           break;}	
			i++;
			
		}			
			System.out.println("Nº pessoas calmas: "+ contpecalm);
			System.out.println("Nº mulheres nervosas: "+ nummulnerv);
			System.out.println("Nº homens agressivos: "+ homagress);
			System.out.println("Nº outros calmos: " + pesnaobincalm);
			System.out.println("Nº pessoas nervosas mais de 40 anos: " + pesnerv40);
			System.out.println("Nº pessoas calmas com menos de 18 anos: " + pescalm18);
		
	}
}
