package br.ufrn.imd.almoxarifado.dominio;

import br.ufrn.imd.almoxarifado.rh.Contato;
import br.ufrn.imd.almoxarifado.rh.Endereco;

/**
 * @author Wellington Costa
 *
 */
public class DadosEntrega {

	private String local;
	private Endereco endereco;
	private Contato contato;


	public DadosEntrega() {
		// TODO Auto-generated constructor stub
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Contato getContato() {
		return contato;
	}


	public void setContato(Contato contato) {
		this.contato = contato;
	}

	
}
