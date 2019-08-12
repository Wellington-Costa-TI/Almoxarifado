/**
 * 
 */
package br.ufrn.imd.almoxarifado.dominio;

/**
 * @author Wellington Costa
 *
 */
public class NaturezaOperacao {
	
	private String nome;
	private String descricao;
	private String codigo;
	/**
	 * 
	 */
	public NaturezaOperacao() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
