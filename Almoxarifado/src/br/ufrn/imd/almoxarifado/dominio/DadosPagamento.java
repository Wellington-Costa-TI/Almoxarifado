package br.ufrn.imd.almoxarifado.dominio;

public class DadosPagamento {
	
	private String banco;
	private String agencia;
	private String conta;
	private String codigoIdentificacaoDV;
	
	
	public DadosPagamento() {
		// TODO Auto-generated constructor stub
	}


	public String getBanco() {
		return banco;
	}


	public void setBanco(String banco) {
		this.banco = banco;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public String getConta() {
		return conta;
	}


	public void setConta(String conta) {
		this.conta = conta;
	}


	public String getCodigoIdentificacaoDV() {
		return codigoIdentificacaoDV;
	}


	public void setCodigoIdentificacaoDV(String codigoIdentificacaoDV) {
		this.codigoIdentificacaoDV = codigoIdentificacaoDV;
	}

	
}
