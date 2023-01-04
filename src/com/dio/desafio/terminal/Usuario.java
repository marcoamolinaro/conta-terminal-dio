package com.dio.desafio.terminal;

public class Usuario {
	
	private String nome;
	private String rg;
	
	public Usuario() {}
		
	public Usuario(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
