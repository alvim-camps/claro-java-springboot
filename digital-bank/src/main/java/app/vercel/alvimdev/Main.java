package app.vercel.alvimdev;

import java.util.Scanner;

import app.vercel.alvimdev.models.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Vamos abrir uma conta! Será poupança e corrente :)");
		System.out.print("Digite seu nome: ");
		String nome = reader.nextLine();

		System.out.print("Digite seu CPF: ");
		String cpf = reader.nextLine();

		System.out.print("Digite sua profissão: ");
		String profissao = reader.nextLine();

		System.out.println();

    Cliente cliente = new Cliente(nome, cpf, profissao);

    Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

    corrente.depositar(1000);
		System.out.println("Depositando milão!");
		System.out.println("Enter para continuar");
		reader.nextLine();

		corrente.transferir(100, poupanca);
		System.out.println("Transferindo 100zao pra poupança!");
		System.out.println("Enter para continuar");
		reader.nextLine();


		System.out.println();
		corrente.imprimirExtrato();

		System.out.println();
		poupanca.imprimirExtrato();
		
		reader.close();
  }
}
