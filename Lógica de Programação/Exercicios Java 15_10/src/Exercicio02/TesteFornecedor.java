package Exercicio02;

public class TesteFornecedor {
	
	public static void main(String[] args) {
		
	
	Fornecedor marcelo = new Fornecedor("Marcelo","Rua pascoal, nº222","56256256256",988885555, 21, 900.00, 500.00);
	Fornecedor eleonor = new Fornecedor("Eleonor", "Rua sol, nº333", "77788899977",988887777, 26, 700.00, 600.00);
	
	marcelo.imprimirInfo();
	marcelo.validarCpf();
	marcelo.obterSaldo();
	eleonor.imprimirInfo();
	eleonor.validarCpf();
	eleonor.obterSaldo();	
	

}

}
