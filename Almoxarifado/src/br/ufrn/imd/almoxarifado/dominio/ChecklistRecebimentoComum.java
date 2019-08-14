/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.almoxarifado.rh.Funcionario;

/**
 * @author Wellington Costa
 *
 */
public class ChecklistRecebimentoComum {

	private Date dataChegada;
//	private LoteMaterial lote;
	private Boolean materialConfereNF;
	private Boolean etiquetadoIdentificacao;
	private Boolean embalagemIntegra;
	private Boolean embalagemSuja;
	private Boolean embalagemUmida;
	private Boolean embalagemDeformada;
	private Boolean embalagemVazada;
	private Boolean embalagemLacreViolado;
	private String placa;
	private Float temperatura;
	private Integer numeroConhecimento;
	private String motorista;
	private String Observacoes;
	private Funcionario conferente;
	private ArrayList<Documento> anexoFotos;
	
	/**
	 * 
	 */
	public ChecklistRecebimentoComum() {
		// TODO Auto-generated constructor stub
	}

}
