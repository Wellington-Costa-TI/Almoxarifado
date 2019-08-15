/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;

/**
 * @author Wellington Costa
 *
 */
public class ConferenciaPesagem {

	private Date data;
	private LoteMaterial lote;
	private Integer numeroVolumes;
	private Double taraKg;
	private Integer pesoVolumes;
	private Boolean executado;
	private Boolean conferido;
	/**
	 * 
	 */
	public ConferenciaPesagem() {
		// TODO Auto-generated constructor stub
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public LoteMaterial getLote() {
		return lote;
	}
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	public Integer getNumeroVolumes() {
		return numeroVolumes;
	}
	public void setNumeroVolumes(Integer numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}
	public Double getTaraKg() {
		return taraKg;
	}
	public void setTaraKg(Double taraKg) {
		this.taraKg = taraKg;
	}
	public Integer getPesoVolumes() {
		return pesoVolumes;
	}
	public void setPesoVolumes(Integer pesoVolumes) {
		this.pesoVolumes = pesoVolumes;
	}
	public Boolean getExecutado() {
		return executado;
	}
	public void setExecutado(Boolean executado) {
		this.executado = executado;
	}
	public Boolean getConferido() {
		return conferido;
	}
	public void setConferido(Boolean conferido) {
		this.conferido = conferido;
	}

	
}
