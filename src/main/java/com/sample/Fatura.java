package com.sample;

public class Fatura {
	int nItems;
	float PrecoTotal;
	int idAtual;
	boolean camisola;
	boolean complementar;
	boolean sexoOposto;
	boolean naoExiste;
	public Fatura(int nItems, float precoTotal, int idAtual, boolean camisola, boolean complementar, boolean sexoOposto,
			boolean naoExiste) {
		super();
		this.nItems = nItems;
		PrecoTotal = precoTotal;
		this.idAtual = idAtual;
		this.camisola = camisola;
		this.complementar = complementar;
		this.sexoOposto = sexoOposto;
		this.naoExiste = naoExiste;
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
	public boolean isSexoOposto() {
		return sexoOposto;
	}
	public void setSexoOposto(boolean sexoOposto) {
		this.sexoOposto = sexoOposto;
	}
	public boolean isNaoExiste() {
		return naoExiste;
	}
	public void setNaoExiste(boolean naoExiste) {
		this.naoExiste = naoExiste;
	}
	
	
	
	
}
