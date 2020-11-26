package Exercicio06;
import java.util.*;
public class TestaConta {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);	
	
	Conta novaConta = new Conta();
	
	while(novaConta.i<=2) {
	
	
	System.out.println("Informe o nome do titular da conta: ");
	novaConta.titular = leia.nextLine();
	
	System.out.println("Informe o número da agência: ");
	novaConta.agencia = leia.nextInt();
	
	System.out.println("Informe o número da conta: ");
	novaConta.numero = leia.nextInt();
	
	System.out.println("Informe o saldo: ");
	novaConta.saldo = leia.nextInt();
	
	leia.nextLine();
	
	System.out.println("Nome do titular: " + novaConta.titular);
	System.out.println("Número da agência: " + novaConta.agencia);
	System.out.println("Número da conta: " + novaConta.numero);
	System.out.println("Saldo na conta: R$" + novaConta.saldo);
	System.out.println("\n\n");
	
	novaConta.i++;
	}		
	
	}
}	

