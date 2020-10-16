package Exercicio04;

import Exercicio01.Pessoa;

public class Administrador extends Pessoa{
	
	private double ajudaDeCusto;
	private double salario;
	
	public Administrador (String nome, String endereco, String cpf, int telefone, int idade, double ajudaDeCusto, double salario)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.ajudaDeCusto = ajudaDeCusto;
		this.salario = salario;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endereço: "+getEndereco());
	}
	
	public void calculaAjudaDeCusto()
	{
		double ajuda = (salario*(ajudaDeCusto/100));
		System.out.println("A ajuda de custo é: "+ajuda);
		
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

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = (salario*0.15);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}	

}
