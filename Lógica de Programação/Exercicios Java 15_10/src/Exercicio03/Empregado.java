package Exercicio03;

import Exercicio01.Pessoa;

public class Empregado extends Pessoa{

	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado (String nome, String endereco, String cpf, int telefone, int idade,int codigoSetor, float salarioBase, float imposto)
	{
		super(nome,endereco,cpf,telefone,idade);//herda os parâmetros da super classe
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endereço: "+getEndereco()+"\n"+"Código do setor: "+codigoSetor+"\n"
		+"Salário Base: "+salarioBase+"\n"+"Valor em porcentagem (sem o '%') de imposto a ser retido do salário: "+imposto);
	}
	
	public void calcularSalario()
	{
		double salario_total = salarioBase - (salarioBase*(imposto/100));
		System.out.println("O salário total a ser recebido pelo empregado: "+getNome()+" é igual a: "+salario_total);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	

}
