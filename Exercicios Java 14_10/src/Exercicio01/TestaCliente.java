package Exercicio01;

import java.util.*;

public class TestaCliente {
	public static void main(String[] args) {
		
		Cliente novoCliente = new Cliente();
		
		Scanner leia = new Scanner(System.in);
		
		while(novoCliente.i <=2) {
		
		System.out.println("Informe seu primeiro nome: ");
		novoCliente.primeiroNome = leia.nextLine();
				
		System.out.println("Informe seu �ltimo nome: ");
		novoCliente.ultimoNome = leia.nextLine();
		
		System.out.println("Informe sua idade: ");
		novoCliente.idade = leia.nextInt();
		
		if(novoCliente.idade>=17 && novoCliente.idade<100) {		}
		else {
			System.out.println("Idade inv�lida");
		}
				
		System.out.println("Informe seu CPF: ");
		novoCliente.cpf = leia.nextInt();
		
		leia.nextLine();
		
		System.out.println("Informe seu g�nero: \n(1) - Feminino \n (2) - Masculino \n (3) - N�o-bin�rie \n (4) - Prefiro n�o reponder");
		novoCliente.gen = leia.nextInt();
		
		switch(novoCliente.gen) {
		case 1:
			novoCliente.genero="Feminino";
			break;
		case 2:
			novoCliente.genero=("Maculino");
			break;
		case 3:
			novoCliente.genero=("N�o-binarie");
			break;
		case 4:
			novoCliente.genero=("Prefiro n�o responder");
			break;	
			default:
				System.out.println("Comando n�o identificado. Por favor digite um n�mero de 1 � 4");
		}
		
		System.out.println("Nome do cliente: " + novoCliente.primeiroNome +" "+ novoCliente.ultimoNome);
		System.out.println("Idade do cliente: " + novoCliente.idade+" anos");
		System.out.println("CPF do cliente: " + novoCliente.cpf);
		System.out.println("G�nero do cliente: " + novoCliente.genero);
		System.out.println("\n\n");
		
		leia.nextLine();
		
		novoCliente.i++;
		}
	}
	

}
