package Exercicios01e02;

public class Preguiça extends Animal {
	
	public Preguiça (String tipo, String nome, int idade, String acao) {
		
		super(tipo, nome, idade, acao);
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("O som da preguiça é: zzzZZZzzZZZzzZZZ");
	}

}
