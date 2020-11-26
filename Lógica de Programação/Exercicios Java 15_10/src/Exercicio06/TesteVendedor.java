package Exercicio06;

public class TesteVendedor {
	
	public static void main(String[] args) {
		
		Vendedor Maria = new Vendedor("Maria", "Rua das Alcantaras,478", "1236478952", 12254789, 42, 10, 15000);
		Vendedor Marcelo = new Vendedor("Marcelo", "Rua dos Pinhais,25", "123647895212", 12254789, 28, 10, 10000);
		
		Maria.imprimirInfo();
		Maria.calculaComissao();
		Marcelo.imprimirInfo();
		Marcelo.calculaComissao();
		
	}

}
