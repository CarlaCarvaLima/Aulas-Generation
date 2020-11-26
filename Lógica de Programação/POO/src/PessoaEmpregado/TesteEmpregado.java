package PessoaEmpregado;

public class TesteEmpregado {

	public static void main (String args[])
	{
		//Empregado Empregado1 = new Empregado;
		Empregado[] objetoEmpregado= new Empregado[3];//instanciando a classe Empregado para um objeto objetoEmpregado
		
		objetoEmpregado[0] = new Empregado("Alex",55000);
		objetoEmpregado[1] = new Empregado("Victor",5000);
		objetoEmpregado[2] = new Empregado("Luisa",50000);
		
		for(int x=0;x<=2;x++)
		{
			objetoEmpregado[x].imprimirInfo();
		}
		System.out.println("**************************");
		for(Empregado variavelloop:objetoEmpregado)//estou percorrendo a classe Empregado com o vetor lista[]
		{
			variavelloop.imprimirInfo();
		}
		System.out.println("**************************");
		
		for(Empregado variavelloop:objetoEmpregado)
		{
			variavelloop.aumentarSalario(10);
			variavelloop.imprimirInfo();
		}
		
	}

}
