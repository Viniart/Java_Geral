package br.fiaphealth.medico;

public class Medico {
	private int crm;
	private String nome;
	private String especialidade;
	private int total;
	
	public String getNome() {
		return nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public Medico (int _crm, String _nome, String _especialidade) {
		crm = _crm;
		nome = _nome;
		especialidade = _especialidade;
	}
	
	public String getDados() {
		
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "Crm: " + crm + "\n";
		aux += "Especialidade: " + especialidade;
		
		return aux;
	}
}
