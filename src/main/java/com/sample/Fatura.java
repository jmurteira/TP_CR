package com.sample;

public class Fatura {
	int nItems;
	float PrecoTotal;
	int idAtual;
	boolean camisola;
	boolean complementar;
	
	public Fatura(int nItems, float precoTotal, int idAtual, boolean camisola, boolean complementar) {
		super();
		this.nItems = nItems;
		PrecoTotal = precoTotal;
		this.idAtual = idAtual;
		this.camisola = camisola;
		this.complementar = complementar;
	}
	public int getnItems() {
		return nItems;
	}
	public void setnItems(int nItems) {
		this.nItems = nItems;
	}
	public float getPrecoTotal() {
		return PrecoTotal;
	}
	public void setPrecoTotal(float precoTotal) {
		PrecoTotal = precoTotal;
	}
	public int getIdAtual() {
		return idAtual;
	}
	public void setIdAtual(int idAtual) {
		this.idAtual = idAtual;
	}
	public boolean isCamisola() {
		return camisola;
	}
	public void setCamisola(boolean camisola) {
		this.camisola = camisola;
	}
	public boolean isComplementar() {
		return complementar;
	}
	public void setComplementar(boolean complementar) {
		this.complementar = complementar;
	}
}
