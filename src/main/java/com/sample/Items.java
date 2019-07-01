package com.sample;

public class Items {
	String nome;
	String tipo;
	String sexo;
	float preco;
	
	public Items(String nome, String tipo, String sexo, float preco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.sexo = sexo;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

}