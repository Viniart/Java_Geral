package br.fiaphealth.consulta;

import br.fiaphealth.medico.Medico;
import br.fiaphealth.paciente.Paciente;

public class Consulta {

	private String data;
	private Paciente paciente;
	private Medico medico;
	
	public Paciente getPaciente() {
		return paciente;
	}

	public String getData() {
		return data;
	}

	public Medico getMedico() {
		return medico;
	}

	public Consulta (String _data, Paciente _paciente, Medico _medico) {
		data = _data;
		paciente = _paciente;
		medico = _medico;
	}
	
	public Consulta (Paciente _paciente, Medico _medico) {
		data = "24/04/2022";
		paciente = _paciente;
		medico = _medico;
	}
	
	public String getDados() {
		
		String aux = "";
		aux += "Data: " + data + "\n";
		aux += "Paciente: " + paciente.getNome() + "\n";
		aux += "Médico: " + medico.getNome();
		
		return aux;
	}
}
