/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

/**
 * @author Wellington Costa
 *
 */
public class DimensaoUnidade {

	private BigDecimal altura;
	private BigDecimal largura;
	private BigDecimal profundidade;
	
	/**
	 * 
	 */
	public DimensaoUnidade() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getLargura() {
		return largura;
	}

	public void setLargura(BigDecimal largura) {
		this.largura = largura;
	}

	public BigDecimal getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(BigDecimal profundidade) {
		this.profundidade = profundidade;
	}

	
}
