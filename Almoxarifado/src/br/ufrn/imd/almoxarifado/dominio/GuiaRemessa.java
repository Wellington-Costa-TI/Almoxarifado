/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.sql.Date;

import br.ufrn.imd.almoxarifado.enums.ViaTransporte;

/**
 * @author Wallace
 *
 */
public class GuiaRemessa {

	private Integer numeroGuiaRemessa;
	private Date dataEmissao;
	private ViaTransporte viaTransporte;
	private String tipoEmbalagem;
	private NaturezaOperacao naturezaOperacao;
	
	
	/**
	 * 
	 */
	public GuiaRemessa() {
		// TODO Auto-generated constructor stub
	}


	public Integer getNumeroGuiaRemessa() {
		return numeroGuiaRemessa;
	}


	public void setNumeroGuiaRemessa(Integer numeroGuiaRemessa) {
		this.numeroGuiaRemessa = numeroGuiaRemessa;
	}


	public Date getDataEmissao() {
		return dataEmissao;
	}


	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}


	public ViaTransporte getViaTransporte() {
		return viaTransporte;
	}


	public void setViaTransporte(ViaTransporte viaTransporte) {
		this.viaTransporte = viaTransporte;
	}


	public String getTipoEmbalagem() {
		return tipoEmbalagem;
	}


	public void setTipoEmbalagem(String tipoEmbalagem) {
		this.tipoEmbalagem = tipoEmbalagem;
	}


	public NaturezaOperacao getNaturezaOperacao() {
		return naturezaOperacao;
	}


	public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}

	
}
