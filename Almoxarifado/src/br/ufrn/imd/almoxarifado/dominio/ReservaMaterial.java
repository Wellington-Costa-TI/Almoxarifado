/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

/**
 * @author Wellington Costa
 *
 */
public class ReservaMaterial {

	private BigDecimal qtd;
	private Material material;
	private Usuario solicitante;
	
	/**
	 * 
	 */
	public ReservaMaterial() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getQtd() {
		return qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Usuario getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Usuario solicitante) {
		this.solicitante = solicitante;
	}

	
}
