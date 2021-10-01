package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
		
	
	//atributos 
	private TipoConta tipo; // preciso importar (import) o tipoConta que é um Enum
	private String numero;
	private String numeroAgencia;
	public String titular;
	private double saldo;
	
	// Método construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	// método setTipo para COLOCAR um valor em um atributo privado.
	public void setTipo(TipoConta tipo){  
		this.tipo=tipo;  
		
	}
	
	// método getTipo para PEGAR um valor em um atributo privado. 
	public TipoConta getTipo(){
		return tipo;
	}
	
	// método set numeroAgencia
	public void setTipoAgencia(String numeroAgencia){
		this.numeroAgencia=numeroAgencia;
		
	}
	
	// método get numeroAgencia
	public numeroAgencia getTipoAgencia() {
		return numeroAgencia;
	}
	
	
	public void depositar(double valorDeposito) { 
		
		if (valorDeposito <= 0) {
			System.out.println("Valor incorreto, não foi possível efetuar o depósito!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	public boolean sacar(double valorSaque) {
		
		if (valorSaque <= 0) {
			System.out.println("Valor incorreto, não foi possível efetuar o saque!");
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
			System.out.println("Não foi possível efetuar a transferência!");
		}
		
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
