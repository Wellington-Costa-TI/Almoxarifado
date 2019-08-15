/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;

import br.ufrn.imd.almoxarifado.enums.StatusRequisicao;

/**
 * @author Wellington Costa
 *
 */
public class HistoricoRequisicao {

	private Date dataRegistro;
	private StatusRequisicao status;
	private Usuario usuario;
	private String observacoes;
	
	/**
	 * 
	 */
	public HistoricoRequisicao() {
		// TODO Auto-generated constructor stub
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public StatusRequisicao getStatus() {
		return status;
	}

	public void setStatus(StatusRequisicao status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	
}
