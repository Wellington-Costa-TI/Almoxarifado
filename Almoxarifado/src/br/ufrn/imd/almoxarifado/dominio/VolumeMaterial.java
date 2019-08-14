/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

/**
 * @author Wellington Costa
 *
 */
public class VolumeMaterial {

	private String codigo;
	private Material material;
	private BigDecimal qtdInicial;
	private BigDecimal qtdAtual;
	private DimensaoUnidade dimensao;
	private LocalizacaoAlmoxarifado localizacao;
	//private LoteMaterial lote;
	/**
	 * 
	 */
	public VolumeMaterial() {
		// TODO Auto-generated constructor stub
	}

}
