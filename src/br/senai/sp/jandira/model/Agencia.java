package br.senai.sp.jandira.model;

public class Agencia {

	private String numeroAgencia;
	private String nomeGerente;
	private String telAgencia;
	private String cidadeAgencia;
	
	
	public void setNumeroAgencia (String numeroAgencia) {
		this.numeroAgencia=numeroAgencia;
	}
	public String getNumeroAgencia() {
		return this.numeroAgencia=numeroAgencia;	
	}
	
	
	public void setNomeGerente (String nomeGerente) {
		this.nomeGerente=nomeGerente;
	}	
	public String getNomeGerente() {
		return this.nomeGerente=nomeGerente;		
	}
	
	
	public void setTelAgencia (String telAgencia) {
		this.telAgencia=telAgencia;
	}
	public String getTelAgencia() {
		return this.telAgencia=telAgencia;
	}
	
	
	public void setCidadeAgencia (String CidadeAgencia) {
		this.cidadeAgencia=cidadeAgencia;
	}
	public String getCidadeAgencia() {
		return this.cidadeAgencia=cidadeAgencia;
	}	
	
}
