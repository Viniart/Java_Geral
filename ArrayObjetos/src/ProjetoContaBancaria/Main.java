package ProjetoContaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Conta[] contas = new Conta[10];
		
		int opcao;
		
		System.out.println("Insira a opção: ");
		System.out.println("1. Abrir Conta");
		System.out.println("2. Sacar");
		System.out.println("3. Depositar");
		System.out.println("4. Consultar Salto");
		System.out.println("5. Finalizar");
		opcao = teclado.nextInt();
		
		while(opcao != 5) {
			int indice = 0;
			
			switch (opcao) {
			case 1:
				teclado.nextLine();
				System.out.println("Insira o nome: ");
				String nome = teclado.nextLine();
				System.out.println("Insira o cpf: ");
				int cpf = teclado.nextInt();
				System.out.println("Insira o saldo: ");
				double saldo = teclado.nextDouble();
				
				contas[indice] = new Conta(nome, cpf, saldo);
				indice++;
			break;
			case 2:
				System.out.println("Insira o valor: ");
				double valor = teclado.nextDouble();
				System.out.println("Insira o numero da conta: ");
				int numero = teclado.nextInt();
				
				contas[numero].sacar(valor);
			break;
			case 3:
				System.out.println("Insira o valor: ");
				valor = teclado.nextDouble();
				System.out.println("Insira o numero da conta: ");
				numero = teclado.nextInt();
				
				contas[numero].depositar(valor);
			break;
			case 4:
				System.out.println("Insira o numero da conta: ");
				numero = teclado.nextInt();
				
				contas[numero].consultar();
			break;
			default:
				System.out.println("Insira um número válido!");
				break;
			}
			
			System.out.println("Insira a opção: ");
			System.out.println("1. Abrir Conta");
			System.out.println("2. Sacar");
			System.out.println("3. Depositar");
			System.out.println("4. Consultar Saldo");
			System.out.println("5. Finalizar");
			opcao = teclado.nextInt();
			
		}

	}

}
