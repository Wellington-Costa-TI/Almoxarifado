/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;

/**
 * @author Wellington Costa
 *
 */
public class DadosFrete {
	
	private Date dataSaida;
	private String nomeTransportador;
	private String placaVeiculp;
	private String municipio;
	private String uf;
	private Boolean fretePagoPorEmitente;  
	
	/**
	 * Construtor padrão da classe.
	 */
	public DadosFrete() {
		// TODO Auto-generated constructor stub
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getNomeTransportador() {
		return nomeTransportador;
	}

	public void setNomeTransportador(String nomeTransportador) {
		this.nomeTransportador = nomeTransportador;
	}

	public String getPlacaVeiculp() {
		return placaVeiculp;
	}

	public void setPlacaVeiculp(String placaVeiculp) {
		this.placaVeiculp = placaVeiculp;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Boolean getFretePagoPorEmitente() {
		return fretePagoPorEmitente;
	}

	public void setFretePagoPorEmitente(Boolean fretePagoPorEmitente) {
		this.fretePagoPorEmitente = fretePagoPorEmitente;
	}

	
}
