package com.dio.desafio.terminal;

import java.util.Locale;
import java.util.Scanner;

public class Operacao {
	

	public static void main(String[] args) throws Exception {
				
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		Usuario usuario = new Usuario();
		
		System.out.println("Entre com o Nome: ");
		String nome = scanner.next();
		usuario.setNome(nome);
		
		System.out.println("Entre com o RG: ");
		String rg = scanner.next();
		usuario.setRg(rg);

		Conta conta = new Conta();
		
		System.out.println("Saldo inicial: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Data: ");
		String data = scanner.next();
		
		conta.setDataOperacao(data);
		conta.setSaldo(saldo);
				
		System.out.println("--------------------------------------------------");
		System.out.println("Dados da Conta do Cliente");
		System.out.println("Nome: " + usuario.getNome());
		System.out.println("RG: " + usuario.getRg());
		System.out.println("Banco: " + conta.getCODIGO_BANCO());
		System.out.println("Agencia: " + conta.getCODIGO_AGENCIA());
		System.out.println("Saldo Inicial: " + conta.getSaldo());
		System.out.println("Data da operação: " + conta.getDataOperacao());
	}
	

	
	

}
