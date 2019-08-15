/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.util.ArrayList;

import br.ufrn.imd.almoxarifado.enums.StatusRequisicao;
import br.ufrn.imd.almoxarifado.rh.Setor;

/**
 * @author Wellington Costa
 *
 */
public class SaidaRequisicaoInterna {

	private String codigo;
	private Usuario requisitante;
	private Setor setorRequisitante;
	private Usuario responsavelSetor;
	private StatusRequisicao statusRequisicao;
	private ArrayList<HistoricoRequisicao> historicoRequisicao;
	private ArrayList<ItemRequisicao> itensRequisicao;
	private SaidaEstoque saidaEstoque;
	
	/**
	 * 
	 */
	public SaidaRequisicaoInterna() {
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Usuario getRequisitante() {
		return requisitante;
	}

	public void setRequisitante(Usuario requisitante) {
		this.requisitante = requisitante;
	}

	public Setor getSetorRequisitante() {
		return setorRequisitante;
	}

	public void setSetorRequisitante(Setor setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}

	public Usuario getResponsavelSetor() {
		return responsavelSetor;
	}

	public void setResponsavelSetor(Usuario responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}

	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}

	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}

	public ArrayList<HistoricoRequisicao> getHistoricoRequisicao() {
		return historicoRequisicao;
	}

	public void setHistoricoRequisicao(ArrayList<HistoricoRequisicao> historicoRequisicao) {
		this.historicoRequisicao = historicoRequisicao;
	}

	public ArrayList<ItemRequisicao> getItensRequisicao() {
		return itensRequisicao;
	}

	public void setItensRequisicao(ArrayList<ItemRequisicao> itensRequisicao) {
		this.itensRequisicao = itensRequisicao;
	}

	public SaidaEstoque getSaidaEstoque() {
		return saidaEstoque;
	}

	public void setSaidaEstoque(SaidaEstoque saidaEstoque) {
		this.saidaEstoque = saidaEstoque;
	}

	
}
