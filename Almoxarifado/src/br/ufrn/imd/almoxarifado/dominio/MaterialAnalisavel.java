/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

import br.ufrn.imd.almoxarifado.producao.DenominacaoComumBrasileira;

/**
 * @author Wellington Costa
 *
 */
public class MaterialAnalisavel {

	private BigDecimal teorConcentracao;
	private Integer prazoEntrega;
	private DenominacaoComumBrasileira dcb;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	private Documento fichaSeguranca;
	private Long registroAnvisa;
	private BigDecimal qtdAmostraAnalise;
	private Integer tempoLimiteAnalise;
	private Integer testeMaquina;
	private Material material;
	
	
	/**
	 * 
	 */
	public MaterialAnalisavel() {
		// TODO Auto-generated constructor stub
	}


	public BigDecimal getTeorConcentracao() {
		return teorConcentracao;
	}


	public void setTeorConcentracao(BigDecimal teorConcentracao) {
		this.teorConcentracao = teorConcentracao;
	}


	public Integer getPrazoEntrega() {
		return prazoEntrega;
	}


	public void setPrazoEntrega(Integer prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}


	public DenominacaoComumBrasileira getDcb() {
		return dcb;
	}


	public void setDcb(DenominacaoComumBrasileira dcb) {
		this.dcb = dcb;
	}


	public String getApresentacaoFarmaceutica() {
		return apresentacaoFarmaceutica;
	}


	public void setApresentacaoFarmaceutica(String apresentacaoFarmaceutica) {
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
	}


	public BigDecimal getVolumeMinimo() {
		return volumeMinimo;
	}


	public void setVolumeMinimo(BigDecimal volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}


	public Documento getFichaSeguranca() {
		return fichaSeguranca;
	}


	public void setFichaSeguranca(Documento fichaSeguranca) {
		this.fichaSeguranca = fichaSeguranca;
	}


	public Long getRegistroAnvisa() {
		return registroAnvisa;
	}


	public void setRegistroAnvisa(Long registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}


	public BigDecimal getQtdAmostraAnalise() {
		return qtdAmostraAnalise;
	}


	public void setQtdAmostraAnalise(BigDecimal qtdAmostraAnalise) {
		this.qtdAmostraAnalise = qtdAmostraAnalise;
	}


	public Integer getTempoLimiteAnalise() {
		return tempoLimiteAnalise;
	}


	public void setTempoLimiteAnalise(Integer tempoLimiteAnalise) {
		this.tempoLimiteAnalise = tempoLimiteAnalise;
	}


	public Integer getTesteMaquina() {
		return testeMaquina;
	}


	public void setTesteMaquina(Integer testeMaquina) {
		this.testeMaquina = testeMaquina;
	}


	public Material getMaterial() {
		return material;
	}


	public void setMaterial(Material material) {
		this.material = material;
	}

	
}
