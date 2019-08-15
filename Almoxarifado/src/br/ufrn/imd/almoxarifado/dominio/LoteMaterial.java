/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.almoxarifado.enums.EstadoLote;
import br.ufrn.imd.almoxarifado.producao.OrdemProducao;
import br.ufrn.imd.almoxarifado.rh.PessoaJuridica;

/**
 * @author Wellington Costa
 *
 */
public class LoteMaterial {
	
	private Material material;
	private Date datavalidade;
	private Date dataFabricacao;
	private EstadoLote estado;
	private String numeroLoteFabricante;
	private String numeroLoteInterno;
	private String numeroLoteFornecedor;
	private Integer volumes;
	private OrdemProducao ordemProducao;
	private PessoaJuridica fabricante;
	private PessoaJuridica fornecedor;
	private Integer qtdCaixaEmbarque;
	private BigDecimal pesoBruto;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private Double valorUnitario;
	
	/**
	 * 
	 */
	public LoteMaterial() {
		// TODO Auto-generated constructor stub
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Date getDatavalidade() {
		return datavalidade;
	}

	public void setDatavalidade(Date datavalidade) {
		this.datavalidade = datavalidade;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public EstadoLote getEstado() {
		return estado;
	}

	public void setEstado(EstadoLote estado) {
		this.estado = estado;
	}

	public String getNumeroLoteFabricante() {
		return numeroLoteFabricante;
	}

	public void setNumeroLoteFabricante(String numeroLoteFabricante) {
		this.numeroLoteFabricante = numeroLoteFabricante;
	}

	public String getNumeroLoteInterno() {
		return numeroLoteInterno;
	}

	public void setNumeroLoteInterno(String numeroLoteInterno) {
		this.numeroLoteInterno = numeroLoteInterno;
	}

	public String getNumeroLoteFornecedor() {
		return numeroLoteFornecedor;
	}

	public void setNumeroLoteFornecedor(String numeroLoteFornecedor) {
		this.numeroLoteFornecedor = numeroLoteFornecedor;
	}

	public Integer getVolumes() {
		return volumes;
	}

	public void setVolumes(Integer volumes) {
		this.volumes = volumes;
	}

	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}

	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}

	public PessoaJuridica getFabricante() {
		return fabricante;
	}

	public void setFabricante(PessoaJuridica fabricante) {
		this.fabricante = fabricante;
	}

	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Integer getQtdCaixaEmbarque() {
		return qtdCaixaEmbarque;
	}

	public void setQtdCaixaEmbarque(Integer qtdCaixaEmbarque) {
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
	}

	public BigDecimal getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public BigDecimal getPesoLiquidoTotal() {
		return pesoLiquidoTotal;
	}

	public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
		this.pesoLiquidoTotal = pesoLiquidoTotal;
	}

	public BigDecimal getTara() {
		return tara;
	}

	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	
}
