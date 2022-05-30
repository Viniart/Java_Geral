package ProjetoContaBancaria;

public class Conta {
	String nome;
	int cpf;
	double saldo;
	
	Conta(String nome, int cpf, double saldo){
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public void sacar(double quantidade) {
		if(saldo < quantidade) {
			System.out.println("Saldo insuficiente!");
		}
		else {
			saldo = saldo - quantidade;
		}
	}
	
	public void depositar(double quantidade) {
		saldo = saldo + quantidade;
	}
	
	public void consultar() { 
		System.out.println("Saldo = " + saldo);
	}
}
