package Exercicios01e02;

public class Cachorro extends Animal{
	
	public Cachorro (String tipo, String nome, int idade, String acao) {
		
		super(tipo,nome, idade, acao);
	}

	@Override
	public void emitirSom()
	{
		System.out.println("O som do cachorro é: Você disse...PIPOCA!?");
	}
}
