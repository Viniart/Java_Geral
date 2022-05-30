package br.fiaphealth.paciente;

public class Paciente {
	
	private String cpf;
	private String nome;
	private String fone;
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Paciente(String _cpf, String _nome, String _fone)
	{
		cpf = _cpf;
		nome = _nome;
		fone = _fone;
	}
	
	public String getDados() {
		
		String aux = "";
		aux += "Cpf: " + cpf + "\n";
		aux += "Nome: " + nome + "\n";
		aux += "Telefone: " + fone;
		
		return aux;
	}
}
