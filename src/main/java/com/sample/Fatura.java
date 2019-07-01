package com.sample;

public class Fatura {
	int nItems;
	int PrecoTotal;
	
	public Fatura(int nItems, int precoTotal) {
		super();
		this.nItems = nItems;
		PrecoTotal = precoTotal;
	}
	public int getnItems() {
		return nItems;
	}
	public void setnItems(int nItems) {
		this.nItems = nItems;
	}
	public int getPrecoTotal() {
		return PrecoTotal;
	}
	public void setPrecoTotal(int precoTotal) {
		PrecoTotal = precoTotal;
	}
	
}
