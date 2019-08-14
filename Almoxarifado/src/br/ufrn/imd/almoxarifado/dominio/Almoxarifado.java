package br.ufrn.imd.almoxarifado.dominio;

import java.util.ArrayList;

import br.ufrn.imd.almoxarifado.enums.TipoMaterial;

public class Almoxarifado {

	private String nome;
	private Usuario chefe;
	private ArrayList<TipoMaterial> tiposMaterial;
	private ArrayList<Usuario> usuariosAlmoxarifado;
	private Boolean enderecado;
	private ArrayList<LocalizacaoAlmoxarifado> localizacoes;
	
	public Almoxarifado() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getChefe() {
		return chefe;
	}

	public void setChefe(Usuario chefe) {
		this.chefe = chefe;
	}

	public ArrayList<TipoMaterial> getTiposMaterial() {
		return tiposMaterial;
	}

	public void setTiposMaterial(ArrayList<TipoMaterial> tiposMaterial) {
		this.tiposMaterial = tiposMaterial;
	}

	public ArrayList<Usuario> getUsuariosAlmoxarifado() {
		return usuariosAlmoxarifado;
	}

	public void setUsuariosAlmoxarifado(ArrayList<Usuario> usuariosAlmoxarifado) {
		this.usuariosAlmoxarifado = usuariosAlmoxarifado;
	}

	public Boolean getEnderecado() {
		return enderecado;
	}

	public void setEnderecado(Boolean enderecado) {
		this.enderecado = enderecado;
	}

	public ArrayList<LocalizacaoAlmoxarifado> getLocalizacoes() {
		return localizacoes;
	}

	public void setLocalizacoes(ArrayList<LocalizacaoAlmoxarifado> localizacoes) {
		this.localizacoes = localizacoes;
	}

	
}
