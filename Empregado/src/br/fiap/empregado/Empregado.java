package br.fiap.empregado;

public abstract class Empregado {
	protected long matricula;
	
	public long getMatricula() {
		return matricula;
	}

	protected String nome;
	
	public Empregado(long matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public abstract double calcularSalario();
	
	@Override
	public String toString() {
		String aux = "";
		aux += "Matrícula: " + matricula + "\n";
		aux += "Nome: " + nome + "\n";
		return aux;
	}
}
