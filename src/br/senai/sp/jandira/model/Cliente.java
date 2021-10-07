package br.senai.sp.jandira.model;

public class Cliente {

	//1° colocar os atributos
	
	private String nome;
	private String email;
	private double salario;
	
	//2° criar metodos para acessar os atributos (set e get)
	
	public void setNome (String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
		
	}
	
	public void setEmail (String email) {
		this.email=email;
	}
	public String getEmail() {
		return this.email;
		
	}
	public void setSalario (double salario) {
		this.salario=salario;
	}
	public double getSalario() {
		return this.salario;
		
	}
	
	
}
