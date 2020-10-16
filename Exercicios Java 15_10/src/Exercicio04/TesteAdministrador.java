package Exercicio04;

public class TesteAdministrador {
	
	public static void main(String[] args) {
		
		Administrador Carlos = new Administrador("Carlos", "Rua Barbacena,127", "01236547891", 12365487, 36, 12, 4000);
		Administrador Carla = new Administrador("Carla", "Rua Petrolina,129", "01236547891", 12365487, 40, 15, 1000);
		
		Carlos.imprimirInfo();
		Carlos.calculaAjudaDeCusto();
		Carla.imprimirInfo();
		Carla.calculaAjudaDeCusto();
	}

}
