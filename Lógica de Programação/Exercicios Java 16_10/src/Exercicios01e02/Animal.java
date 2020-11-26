package Exercicios01e02;

import java.util.*;

public class Animal {
		
	private String tipo;
	private String nome;
	private int idade;
	private String acao;
	
	public Animal (String tipo, String nome, int idade, String acao) {
		
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.idade = idade;
		this.acao = acao;
	}
			
		public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getAcao() {
		return acao;
	}

	public void setAção(String acao) {
		this.acao = acao;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setAcao(String acao) {
		this.acao = acao;
	}

	public void imprimir() {
		
		System.out.println("O animal é um(a): "+getTipo()+". O nome do animal é "+getNome()+". Ele tem "+getIdade()+" anos de idade e ele(a) se movimenta "+getAcao());
	}
	
	public void emitirSom() {
		System.out.println("...");
	}
	
	
	public void escolheSom() {
	
	}
	
	public void pulaLinha() {
		
		System.out.println("\n\n");
	}

}
