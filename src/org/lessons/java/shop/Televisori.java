package org.lessons.java.shop;

public class Televisori extends Prodotto {
	
	private int dimensione;
	private boolean smartTv;
	
	public Televisori(
			String codice, String nome, String marca, float prezzo, int iva,
			int dimensione, boolean smartTv) {
		super (codice, nome, marca, prezzo, iva);
		setDimensione(dimensione);
		setSmartTv(smartTv);
		
	}

	//DIMENSIONE
	public int getDimensione() {
		return dimensione;
	}
	public void setDimensione(int dimensione) {
		if(dimensione > 0)
			this.dimensione = dimensione;
	}
	
	//ISSMART
	public boolean isSmartTv() {
		return smartTv;
	}
	public void setSmartTv(boolean isSmart) {
		
		this.smartTv = isSmart;
	}
	
	
	
	@Override
	public String toString() {
		return "prodotto: " + getNome() + " | marca: " + getMarca() + " | prezzo senza IVA: € " + getPrezzo() 
		+ " | prezzo con IVA: € " + String.format("%.02f", prezzoFormattato())
		+ " | dimensioni: " + getDimensione() + " pollici" + " | smart TV: " + (isSmartTv() ? "Si" : "No");
	}
	
	
}
