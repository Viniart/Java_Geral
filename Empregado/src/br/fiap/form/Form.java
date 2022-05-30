package br.fiap.form;

import static javax.swing.JOptionPane.*;

import br.fiap.controle.Controle;

import static java.lang.Integer.parseInt;

public class Form {

	private final int tamanho = 5;
	private Controle controle = new Controle(tamanho);
	
	public void menu() {
		int opcao;
		String aux = "Escolha uma opcao:\n";
		
		aux += "1. Cadastro\n";
		aux += "2. Pesquisa\n";
		aux += "3. Listagem\n";
		aux += "4. Finalizar\n";
		
		do {
			opcao = parseInt(showInputDialog(aux));
			if(opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Opção Inválida");
			}
			else {
				switch (opcao) {
				case 1:
					controle.cadastrar();
					break;
				case 2:
					controle.pesquisar();
					break;
				case 3:
					controle.listar();
					break;
				}
			}
		} while(opcao != 4);
	}
	
}
