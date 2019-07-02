package com.sample;

public class Fatura {
	int nItems;
	float PrecoTotal;
	int idAtual;
	
	public Fatura(int nItems, float precoTotal, int idAtual) {
		super();
		this.nItems = nItems;
		PrecoTotal = precoTotal;
		this.idAtual = idAtual;
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
	
}
