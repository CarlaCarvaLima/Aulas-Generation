package Exercicio03;

public class TesteEmpregado {
	
	public static void main (String args[])
	{
		Empregado rafael = new Empregado("void Rafael","Rua da Marola,no.199","55566677788",917654545,15,20,1500,10);
		//Operario luisa = new Operario();
		rafael.imprimirInfo();
		rafael.calcularSalario();
		rafael.validarCpf();
	}
}
