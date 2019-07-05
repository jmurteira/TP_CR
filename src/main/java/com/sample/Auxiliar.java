package com.sample;

public class Auxiliar {
	int idAux;
	int compraAposCrianca;
	boolean naoExiste;
	int guardaUltimoItem;
	public Auxiliar(int idAux, int compraAposCrianca, boolean naoExiste, int guardaUltimoItem) {
		super();
		this.idAux = idAux;
		this.compraAposCrianca = compraAposCrianca;
		this.naoExiste = naoExiste;
		this.guardaUltimoItem = guardaUltimoItem;
	}
	public int getIdAux() {
		return idAux;
	}
	public void setIdAux(int idAux) {
		this.idAux = idAux;
	}
	public int getCompraAposCrianca() {
		return compraAposCrianca;
	}
	public void setCompraAposCrianca(int compraAposCrianca) {
		this.compraAposCrianca = compraAposCrianca;
	}
	public boolean isNaoExiste() {
		return naoExiste;
	}
	public void setNaoExiste(boolean naoExiste) {
		this.naoExiste = naoExiste;
	}
	public int getGuardaUltimoItem() {
		return guardaUltimoItem;
	}
	public void setGuardaUltimoItem(int guardaUltimoItem) {
		this.guardaUltimoItem = guardaUltimoItem;
	}
	
	
	

}
