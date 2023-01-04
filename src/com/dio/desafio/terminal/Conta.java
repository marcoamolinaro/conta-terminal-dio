package com.dio.desafio.terminal;

public class Conta {
	
	private final String CODIGO_BANCO = "001";
	private final String CODIGO_AGENCIA = "00001-01";
	
	private Usuario usuario;
	
	private double saldo;
	
	private String dataOperacao;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCODIGO_BANCO() {
		return CODIGO_BANCO;
	}

	public String getCODIGO_AGENCIA() {
		return CODIGO_AGENCIA;
	}

	public String getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(String dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
}
