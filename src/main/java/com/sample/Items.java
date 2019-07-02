package com.sample;

public class Items {
	int id; //id do item
	String nome;
	String tipo;
	String sexo;
	float preco;
	int stock;
	int complementar;
	public Items(int id, String nome, String tipo, String sexo, float preco, int stock, int complementar) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.sexo = sexo;
		this.preco = preco;
		this.stock = stock;
		this.complementar = complementar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getComplementar() {
		return complementar;
	}
	public void setComplementar(int complementar) {
		this.complementar = complementar;
	}
		
}