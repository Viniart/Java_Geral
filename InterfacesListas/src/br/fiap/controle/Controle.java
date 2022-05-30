package br.fiap.controle;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

import br.fiap.empregado.Gerente;
import br.fiap.empregado.Vendedor;
import br.fiap.pessoa.Pessoa;

public class Controle {
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();

	public void menu() {

		
		String aux = "";
		aux += "Escolha uma operação\n";
		aux += "1. Cadastrar Empregado\n";
		aux += "2. Cadastrar Cliente\n";
		aux += "3. Pesquisar\n";
		aux += "4. Listar Empregados\n";
		aux += "5. Listar Clientes\n";
		aux += "6. Remover\n";
		aux += "7. Finalizar\n";
		
		
		int opcao = 0;
		
		do {
			
			try {
				opcao = parseInt(showInputDialog(aux));
				if(opcao < 1 || opcao > 7) {
					showMessageDialog(null, "Insira um valor válido!");
				}
			} 
			catch (NumberFormatException e) {
				showMessageDialog(null, "Você deve digitar um número");
			}
			
			switch (opcao) {
				case 1: {
					cadastrarEmpregado();
					break;
				}
				case 2: {
					break;
				}
				case 3: {
					pesquisar();
					break;
				}
				case 4: {
					listarEmpregado();
					break;
				}
				case 5: {
					break;
				}
				case 6: {
					remover();
					break;
				}
			}
		} while(opcao != 7);
		
		
		
	}
	
	private void cadastrarEmpregado() {
		int opcao = 0;
		String nome, cpf, matricula;
		double salario, bonus;
		double totalDasVendas, comissao;
		
		String aux = "Escolha uma opção:\n";
		aux += "1. Cadastrar Vendedor\n";
		aux += "2. Cadastrar Gerente\n";
		aux += "3. Retornar";
		
		do {
			try {
				opcao = parseInt(showInputDialog(aux));
				if(opcao < 1 || opcao > 3) {
					showMessageDialog(null, "Insira uma opção válida");
				}
				else {
					if(opcao == 1 || opcao == 2) {
						nome = showInputDialog("Insira o nome");
						cpf = showInputDialog("Insira o cpf");
						matricula = showInputDialog("Insira a matricula");
						
						if(opcao == 1) {
							totalDasVendas = parseDouble(showInputDialog("Total das vendas:"));
							comissao = parseDouble(showInputDialog("Comissão:"));
							lista.add(new Vendedor(nome, cpf, matricula, totalDasVendas, comissao));
						}
						else if (opcao == 2) {
							salario = parseDouble(showInputDialog("Salário:"));
							bonus = parseDouble(showInputDialog("Bônus:"));
							lista.add(new Gerente(nome, cpf, matricula, salario, bonus));
						}
						
					}
				}
			} catch (NumberFormatException e) {
				showMessageDialog(null, "Você deve digitar um número!");
			}
		} while (opcao != 3);
		
	}
	
	private void listarEmpregado() {
		String gerente = "Gerente\n";
		String vendedor = "Vendedor\n";
		
		for (Pessoa p : lista) {
			if(p instanceof Gerente) {
				gerente += p + "\n";
			}
			else if(p instanceof Vendedor) {
				vendedor += p + "\n";
			}
		}
		showMessageDialog(null, gerente+"\n"+vendedor);
		
	}
	
	private void pesquisar() {
		int indice = pesquisarAux();
		if(indice != -1) {
			showConfirmDialog(null, lista.get(indice));
		}
	}
	
	private int pesquisarAux() {
		int indice = -1;
		String cpf = showInputDialog("CPF para pesquisa");
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getCpf().equals(cpf)) {
				indice = i;
			}
		}
		if(indice == -1) {
			showMessageDialog(null, "CPF não encontrado");
		}
		return indice;
	}
	
	private void remover() {
		int indice = pesquisarAux();
		if(indice != -1) {
			lista.remove(indice);
		}
	}
	
}
