package Exercicio02;

import Exercicio01.Pessoa;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String cpf, int telefone,int idade,double valorCredito,double valorDivida)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endere�o: "+getEndereco()+"\n"
		+"\n"+"Valor cr�dito: "+valorCredito+"\n"+"Valor d�vida: "+valorDivida);
	}
	
	public void obterSaldo()
	{
		double diferencasaldo = valorCredito - valorDivida;
		System.out.println("O saldo referente ao fornecedor � igual a: "+diferencasaldo);
		
	}
	
	public void validarCpf()
	{
		if(getCpf().length()!=11)
		{
			System.out.println("--CPF inv�lido!!!");
		}
		else
		{
			System.out.println("--CPF v�lido!!!");
		}
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	


}
