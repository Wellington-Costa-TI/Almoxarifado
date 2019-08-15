/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.almoxarifado.rh.Endereco;

/**
 * @author Wellington Costa
 *
 */
public class ChecklistTransferencia {

	private Material material;
	private BigDecimal qtd;
	private Endereco local;
	private Date dataConferencia;
	private String Observacoes;
	private ArrayList<Documento> anexoFotos;
	private Boolean aprovado;
	
	/**
	 * 
	 */
	public ChecklistTransferencia() {
		// TODO Auto-generated constructor stub
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtd() {
		return qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

	public Endereco getLocal() {
		return local;
	}

	public void setLocal(Endereco local) {
		this.local = local;
	}

	public Date getDataConferencia() {
		return dataConferencia;
	}

	public void setDataConferencia(Date dataConferencia) {
		this.dataConferencia = dataConferencia;
	}

	public String getObservacoes() {
		return Observacoes;
	}

	public void setObservacoes(String observacoes) {
		Observacoes = observacoes;
	}

	public ArrayList<Documento> getAnexoFotos() {
		return anexoFotos;
	}

	public void setAnexoFotos(ArrayList<Documento> anexoFotos) {
		this.anexoFotos = anexoFotos;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}

	
}
