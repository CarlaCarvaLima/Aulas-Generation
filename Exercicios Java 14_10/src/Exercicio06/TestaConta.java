package Exercicio06;
import java.util.*;
public class TestaConta {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);	
	
	Conta novaConta = new Conta();
	
	while(novaConta.i<=2) {
	
	
	System.out.println("Informe o nome do titular da conta: ");
	novaConta.titular = leia.nextLine();
	
	System.out.println("Informe o n�mero da ag�ncia: ");
	novaConta.agencia = leia.nextInt();
	
	System.out.println("Informe o n�mero da conta: ");
	novaConta.numero = leia.nextInt();
	
	System.out.println("Informe o saldo: ");
	novaConta.saldo = leia.nextInt();
	
	leia.nextLine();
	
	System.out.println("Nome do titular: " + novaConta.titular);
	System.out.println("N�mero da ag�ncia: " + novaConta.agencia);
	System.out.println("N�mero da conta: " + novaConta.numero);
	System.out.println("Saldo na conta: R$" + novaConta.saldo);
	System.out.println("\n\n");
	
	novaConta.i++;
	}		
	
	}
}	

