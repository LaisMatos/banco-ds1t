package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
		
	
	//atributos 
	private TipoConta tipo; // preciso importar (import) o tipoConta que � um Enum
	private String numero;
	private String numeroAgencia;
	public String titular;
	private double saldo;
	
	// M�todo construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	// m�todo setTipo para COLOCAR um valor em um atributo privado.
	public void setTipo(TipoConta tipo){  
		this.tipo=tipo;  
		
	}
	
	// m�todo getTipo para PEGAR um valor em um atributo privado. 
	public TipoConta getTipo(){
		return tipo;
	}
	
	// m�todo set numeroAgencia
	public void setTipoAgencia(String numeroAgencia){
		this.numeroAgencia=numeroAgencia;
		
	}
	
	// m�todo get numeroAgencia
	public numeroAgencia getTipoAgencia() {
		return numeroAgencia;
	}
	
	
	public void depositar(double valorDeposito) { 
		
		if (valorDeposito <= 0) {
			System.out.println("Valor incorreto, n�o foi poss�vel efetuar o dep�sito!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	public boolean sacar(double valorSaque) {
		
		if (valorSaque <= 0) {
			System.out.println("Valor incorreto, n�o foi poss�vel efetuar o saque!");
			return false;
		} else if (valorSaque > saldo) {
			System.out.println("Saldo insuficiente!!");
			return false;
		} else {
			saldo -= valorSaque;
			return true;
		}
		
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("N�o foi poss�vel efetuar a transfer�ncia!");
		}
		
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
