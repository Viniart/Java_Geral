package br.fiap.controle;

import javax.swing.JOptionPane;

import br.fiap.empregado.Empregado;
import br.fiap.empregado.EmpregadoComissionado;
import br.fiap.empregado.EmpregadoHorista;

public class Controle {

	private Empregado[] lista;
	private int indice;
	
	public Controle(int tamanho) {
		this.lista = new Empregado[tamanho];
	}
	
	public void cadastrar() {
		if(indice < lista.length) {
			
			long matricula = Long.parseLong(JOptionPane.showInputDialog("Insira o número de matrícula"));
			String nome = JOptionPane.showInputDialog("Insira o nome:");
			
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("1 - Horista\n2 - Comissionado:"));
			
			Empregado empregado;
			
			do {
				
				if(tipo == 1) {
					
					int totalDeHoras = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de horas trabalhadas:"));
					double valorHoraTrabalhada = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da hora trabalhada:"));
					
					empregado = new EmpregadoHorista(matricula, nome, totalDeHoras, valorHoraTrabalhada);
					
				}
				else {
					
					double totalDeVendas =  Double.parseDouble(JOptionPane.showInputDialog("Insira o total de vendas:"));
					double comissao = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da comissao:"));
					
					empregado = new EmpregadoComissionado(matricula, nome, totalDeVendas, comissao);
					
				}
			} while(tipo != 1 && tipo != 2);
			
			lista[indice] = empregado;
			indice++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Espaço em disco insuficiente");
		}
	}
	
	public Empregado pesquisar() {
		long matricula = Long.parseLong(JOptionPane.showInputDialog("Insira o número de matrícula"));
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i].getMatricula() == matricula) {
				return lista[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Empregado não encontrado");
		return null;
	}

	public String prepararLista() {
		String horista = "Empregado Horista\n";
		String comissionado = "Empregado Comissionado\n";
		
		for (int i = 0; i < indice; i++) {
			if(lista[i] instanceof EmpregadoHorista) {
				horista += lista[i];
				// Chama o toString automaticamente
			}
			else {
				comissionado += lista[i];
			}			
		}
		return horista + "\n\n" + comissionado;
	}
	
	public void listar() {
		String lista = prepararLista();
		
		JOptionPane.showMessageDialog(null, lista);
		
//		System.out.println(lista);
	}
	
}
