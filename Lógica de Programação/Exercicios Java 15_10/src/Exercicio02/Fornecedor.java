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
		+"\n"+"Endereço: "+getEndereco()+"\n"
		+"\n"+"Valor crédito: "+valorCredito+"\n"+"Valor dívida: "+valorDivida);
	}
	
	public void obterSaldo()
	{
		double diferencasaldo = valorCredito - valorDivida;
		System.out.println("O saldo referente ao fornecedor é igual a: "+diferencasaldo);
		
	}
	
	public void validarCpf()
	{
		if(getCpf().length()!=11)
		{
			System.out.println("--CPF inválido!!!");
		}
		else
		{
			System.out.println("--CPF válido!!!");
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
