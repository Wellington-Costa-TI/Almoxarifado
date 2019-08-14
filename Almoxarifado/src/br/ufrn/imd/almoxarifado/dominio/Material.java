/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

import br.ufrn.imd.almoxarifado.enums.StatusMaterial;

/**
 * @author Wellington Costa
 *
 */
public class Material {

	private Integer codigo;
	private String nome;
	private GrupoMaterial grupoMaterial;
	private Integer estoqueMinimo;
	private UnidadeMedida unidadeEstoque;
	private UnidadeMedida unidadeEntrada;
	private BigDecimal fatorConversaoEntrada;
	private UnidadeMedida unidadeSaida;
	private BigDecimal fatorConversaoSaida;
	private String dadosAdicionais;
	private ClassificacaoMaterial classificacao;
	private Integer catmat;
	private String condicaoArmazenagem;
	private StatusMaterial status;
	
	/**
	 * 
	 */
	public Material() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}

	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}

	public Integer getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(Integer estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public UnidadeMedida getUnidadeEstoque() {
		return unidadeEstoque;
	}

	public void setUnidadeEstoque(UnidadeMedida unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}

	public UnidadeMedida getUnidadeEntrada() {
		return unidadeEntrada;
	}

	public void setUnidadeEntrada(UnidadeMedida unidadeEntrada) {
		this.unidadeEntrada = unidadeEntrada;
	}

	public BigDecimal getFatorConversaoEntrada() {
		return fatorConversaoEntrada;
	}

	public void setFatorConversaoEntrada(BigDecimal fatorConversaoEntrada) {
		this.fatorConversaoEntrada = fatorConversaoEntrada;
	}

	public UnidadeMedida getUnidadeSaida() {
		return unidadeSaida;
	}

	public void setUnidadeSaida(UnidadeMedida unidadeSaida) {
		this.unidadeSaida = unidadeSaida;
	}

	public BigDecimal getFatorConversaoSaida() {
		return fatorConversaoSaida;
	}

	public void setFatorConversaoSaida(BigDecimal fatorConversaoSaida) {
		this.fatorConversaoSaida = fatorConversaoSaida;
	}

	public String getDadosAdicionais() {
		return dadosAdicionais;
	}

	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}

	public ClassificacaoMaterial getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(ClassificacaoMaterial classificacao) {
		this.classificacao = classificacao;
	}

	public Integer getCatmat() {
		return catmat;
	}

	public void setCatmat(Integer catmat) {
		this.catmat = catmat;
	}

	public String getCondicaoArmazenagem() {
		return condicaoArmazenagem;
	}

	public void setCondicaoArmazenagem(String condicaoArmazenagem) {
		this.condicaoArmazenagem = condicaoArmazenagem;
	}

	public StatusMaterial getStatus() {
		return status;
	}

	public void setStatus(StatusMaterial status) {
		this.status = status;
	}

	
}
