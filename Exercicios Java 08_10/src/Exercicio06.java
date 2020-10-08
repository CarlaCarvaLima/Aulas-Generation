import java.util.*; 
public class Exercicio06 {
	
	public static void main(String [] args)
	
	{
		 int num, soma=0;
		 float media=0, cont=0;
		 Scanner leia = new Scanner(System.in);
		 
		 do {
			 System.out.println("Digite um número inteiro (para sair digite 0): ");
			 num=leia.nextInt();
			 
			 if(num %3==0 && num!=0){
			 soma=soma+num;
			 cont++;}
			 
			 System.out.println("Digite um número inteiro (para sair digite 0): ");
			 num=leia.nextInt();

			 if(num %3==0 && num!=0){
			 soma=soma+num;
			 cont++;}
		 }while(num!=0);
		 
		 
		 media=soma/cont;
		 
		 System.out.println("\nA média dos números é: "+ media);
	}
}
