package Exercicios01e02;

public class Pregui�a extends Animal {
	
	public Pregui�a (String tipo, String nome, int idade, String acao) {
		
		super(tipo, nome, idade, acao);
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("O som da pregui�a �: zzzZZZzzZZZzzZZZ");
	}

}
