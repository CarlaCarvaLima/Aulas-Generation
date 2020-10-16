package Exercicio06;

import Exercicio01.Pessoa;

public class Vendedor extends Pessoa{
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String cpf, int telefone, int idade, double comissao, double valorVendas)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endereço: "+getEndereco());
	}
	
	public void calculaComissao()
	{
		double com = (valorVendas*(comissao/100));
		System.out.println("A comissao é: "+com);
		
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
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
