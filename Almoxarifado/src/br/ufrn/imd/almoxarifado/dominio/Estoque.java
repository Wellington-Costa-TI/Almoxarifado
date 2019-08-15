/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author Wellington Costa
 *
 */
public class Estoque {

	private BigDecimal qtdAtual;
	private Almoxarifado almoxarifado;
	private LoteMaterial lote;
	private Material material;
	private BigDecimal qtdMaxima;
	private ArrayList<MovimentacaoEstoque> historicoMovimentacoes;
	
	/**
	 * 
	 */
	public Estoque() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(BigDecimal qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}

	public ArrayList<MovimentacaoEstoque> getHistoricoMovimentacoes() {
		return historicoMovimentacoes;
	}

	public void setHistoricoMovimentacoes(ArrayList<MovimentacaoEstoque> historicoMovimentacoes) {
		this.historicoMovimentacoes = historicoMovimentacoes;
	}

	
}
