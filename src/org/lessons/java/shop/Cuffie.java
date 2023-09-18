package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	
	private String colore;
	private boolean isCablate;
	
	public Cuffie(
			String nome, String marca, float prezzo, int iva,
			String colore, boolean isCablate) {
		super (nome, marca, prezzo, iva);
		setColore(colore);
		
	}
	
	//COLORE
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	//ISCABLATE
	public boolean isCablate() {
		return isCablate;
	}
	public void setCablate(boolean isCablate) {
		
		this.isCablate = isCablate;
	}
	
	
	@Override
	public String toString() {
		return "nome prodotto: " + getNome() + " | marca: " + getMarca() + " | prezzo senza IVA: € " + getPrezzo() 
		+ " | prezzo con IVA: € " + String.format("%.02f", prezzoFormattato())
		+ " | colore: " + getColore() + " | wireless: " + (!isCablate() ? "Si" : "No");
	}
}
