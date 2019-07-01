package com.sample;

public class Clientes {
	String nome;
	String sexo;
	String estado_civil;
	Boolean filhos;
		
	public Clientes(String nome, String sexo, String estado_civil, Boolean filhos) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
		this.filhos = filhos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public Boolean getFilhos() {
		return filhos;
	}
	public void setFilhos(Boolean filhos) {
		this.filhos = filhos;
	}
}
