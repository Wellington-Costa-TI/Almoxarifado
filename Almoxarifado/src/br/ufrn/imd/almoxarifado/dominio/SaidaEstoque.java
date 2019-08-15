/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.almoxarifado.enums.StatusMovimentacao;
import br.ufrn.imd.almoxarifado.rh.PessoaJuridica;

/**
 * @author Wellington Costa
 *
 */
public class SaidaEstoque {

	private Usuario responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private ArrayList<MovimentacaoEstoque> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private PessoaJuridica transportadora;
	private ArrayList<Documento> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestinatario;
	private String justificativa;
	
	/**
	 * 
	 */
	public SaidaEstoque() {
		// TODO Auto-generated constructor stub
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public ArrayList<MovimentacaoEstoque> getItens() {
		return itens;
	}

	public void setItens(ArrayList<MovimentacaoEstoque> itens) {
		this.itens = itens;
	}

	public StatusMovimentacao getStatus() {
		return status;
	}

	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public PessoaJuridica getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}

	public ArrayList<Documento> getAnexos() {
		return anexos;
	}

	public void setAnexos(ArrayList<Documento> anexos) {
		this.anexos = anexos;
	}

	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}

	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}

	public PessoaJuridica getPjDestinatario() {
		return pjDestinatario;
	}

	public void setPjDestinatario(PessoaJuridica pjDestinatario) {
		this.pjDestinatario = pjDestinatario;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	
}
