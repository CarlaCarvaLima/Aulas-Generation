package Exercicios01e02;

public class Tigre extends Animal{

	public Tigre (String tipo, String nome, int idade, String acao) {
		
		super(tipo, nome, idade, acao);
				
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("O som do tigre é: Desperte o tigre em você!");
	}
}
