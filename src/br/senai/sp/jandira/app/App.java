package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		//criar agencia da maria
		Agencia agenciaMaria = new Agencia();	
		agenciaMaria.setNumeroAgencia("5487-1 ");
		agenciaMaria.setNomeGerente("Laís");
		agenciaMaria.setTelAgencia("(11)9 0000-1111 ");
		agenciaMaria.setCidadeAgencia("Jandira");		
		
		//criar a cliente maria, com o import
		Cliente clienteMaria = new Cliente ();
		clienteMaria.setNome("Maria");
		clienteMaria.setEmail("maria@gmail.com");
		clienteMaria.setSalario(5000);
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setCliente(clienteMaria);
		contaMaria.setAgencia(agenciaMaria);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println("----"+contaMaria.getTipo());
		
		//criar agencia da pedro
		Agencia agenciaPedro = new Agencia();	
		agenciaPedro.setNumeroAgencia("5487-1 ");
		agenciaPedro.setNomeGerente("Laís");
		agenciaPedro.setTelAgencia("(11)9 0000-1111 ");
		agenciaPedro.setCidadeAgencia("Jandira");
		
		//criar a cliente pedro 
		Cliente clientePedro=new Cliente();
		clientePedro.setNome("Pedro");
		clientePedro.setEmail("pedro@gmail.com");
		clientePedro.setSalario(3000);
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agenciaPedro);
		
		System.out.println("----"+contaPedro.getTipo());
		
		//criar agencia da maria
				Agencia agenciaMaria = new Agencia();	
				agenciaMaria.setNumeroAgencia("5487-1 ");
				agenciaMaria.setNomeGerente("Laís");
				agenciaMaria.setTelAgencia("(11)9 0000-1111 ");
				agenciaMaria.setCidadeAgencia("Jandira");
		
		//criar a cliente ana
		Cliente clienteAna=new Cliente();
		clienteAna.setNome("Ana");
		clienteAna.setEmail("ana@gmail.com");
		clienteAna.setSalario(10000);
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setCliente(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo (TipoConta.SALARIO);
		contaAna.setAgencia(agenciaAna);
		
		System.out.println("----"+contaAna.getTipo());
		
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		// Depositar 100 Reais na conta da Maria
		contaMaria.depositar(200);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		// Sacar 100 Reais da conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("========== TRANSFERINDO ===========");
		System.out.println();
		
		// Transferir 200 Reais da 
		// conta da Maria para a conta do Pedro
		contaMaria.transferir(contaPedro, 2000);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		
	}

}
