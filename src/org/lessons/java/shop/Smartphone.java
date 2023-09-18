package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	private int imei;
	private int memoria;
	
	public Smartphone(
			String codice, String nome, String marca, float prezzo, int iva,
			int imei, int memoria) {
		super (codice, nome, marca, prezzo, iva);
		setImei(imei);
		setMemoria(memoria);
	}
	
	//IMEI
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	
	//MEMORIA
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return "prodotto: " + getNome() + " | marca: " + getMarca() + " | prezzo senza IVA: € " + getPrezzo() 
		+ " | prezzo con IVA: € " + String.format("%.02f", prezzoFormattato())
		+ " | IMEI: " + getImei() + " | memoria " + getMemoria() + " GB";
	}
}
