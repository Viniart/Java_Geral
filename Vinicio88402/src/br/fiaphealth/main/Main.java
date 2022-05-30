package br.fiaphealth.main;

import javax.swing.JOptionPane;

import br.fiaphealth.consulta.Consulta;
import br.fiaphealth.medico.Medico;
import br.fiaphealth.paciente.Paciente;

public class Main {
	
	public static void main(String[] args) {
		
		final int quantConsultas = 4;
		Consulta[] consultas = new Consulta[quantConsultas];
		Paciente[] pacientes = new Paciente[6];
		
		Medico medico1 = new Medico(44431, "Carlos", "Pediatria");
		Medico medico2 = new Medico(11223, "Antonio", "Neurologia");
		
		JOptionPane.showMessageDialog(null, "Há 2 médicos cadastrados, e serão cadastrados 6 pacientes");
		
		for (int i = 0; i < 6; i++) {
			String nome = JOptionPane.showInputDialog("Nome do paciente");
			String cpf = JOptionPane.showInputDialog("Cpf do paciente");
			String fone = JOptionPane.showInputDialog("Telefone do paciente");
			
			pacientes[i] = new Paciente(cpf, nome, fone);
		}
		
		
		for (int i = 0; i < consultas.length; i++) {
			
			int opcao = 0;
			boolean cpfValido = false;
			boolean cpfInvalido = false;
			Paciente pacienteSelecionado = null;
			
			do {
				String cpfConsulta = JOptionPane.showInputDialog("Cpf do paciente para consulta");
				
				for (Paciente paciente : pacientes) {
					if(paciente.getCpf().equalsIgnoreCase(cpfConsulta)) {
						cpfValido = true;
						pacienteSelecionado = paciente;
						
						for (Consulta consulta : consultas) {
							if(consulta != null) {
								if(pacienteSelecionado.getCpf().equalsIgnoreCase(consulta.getPaciente().getCpf())) {
									cpfInvalido = true;
								}
							}
							
						}
					}
					
					
					
				}
				
				if(cpfValido == false && cpfInvalido == false) {
					JOptionPane.showMessageDialog(null, "Cpf não cadastrado");
				}
				if(cpfInvalido == true) {
					JOptionPane.showMessageDialog(null, "Apenas uma consulta por cpf");
					cpfValido = false;
				}
				
				cpfInvalido = false;
			} while(cpfValido == false);
			
			String data = JOptionPane.showInputDialog("Data da Consulta");
			
			do {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Pediatria\n2 - Neurologia"));
			
				if(opcao != 1 && opcao != 2) {
					JOptionPane.showMessageDialog(null, "Valor Inválido!");
				}
			} while (opcao != 1 && opcao != 2);
			
			
			if(opcao == 1) {
				consultas[i] = new Consulta(data, pacienteSelecionado, medico1);
			}
			else {
				consultas[i] = new Consulta(data, pacienteSelecionado, medico2);
			}
			
			
		}
		
		String pacientesComConsulta = "";
		for (int i = 0; i < consultas.length; i++) {
			pacientesComConsulta += consultas[i].getPaciente().getDados() + "\n\n";
		}
		
		JOptionPane.showMessageDialog(null, "Pacientes com consultas marcadas");
		JOptionPane.showMessageDialog(null, pacientesComConsulta);
		
		String pacientesAgendados = "";
		for (Consulta consulta : consultas) {
			if(consulta.getData().equalsIgnoreCase("26/04/2022") && 
			consulta.getMedico().getEspecialidade().equalsIgnoreCase("Neurologia")) {
				pacientesAgendados += consulta.getDados() + "\n\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, "Pacientes com consultas no dia 26/04 com um neurologista");
		JOptionPane.showMessageDialog(null, pacientesAgendados);
	}
}
