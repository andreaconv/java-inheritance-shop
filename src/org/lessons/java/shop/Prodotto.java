package org.lessons.java.shop;

public class Prodotto {

	private String codice;
	private String nome;
	private String marca;
	private float prezzo;
	private int iva;
	
	public Prodotto(String nome, String marca, float prezzo, int iva) {
		
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
		
	}
	
	//CODICE
	public String getCodice() {
		return codice;
	}
//	public void setCodice(String codice) {
//		this.codice = codice;
//	}
	
	//NOME
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	//MARCA
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//PREZZO
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	//IVA
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public float prezzoFormattato() {
		return getPrezzo() + (getPrezzo() / 100 * getIva());

	}
	
	@Override
	public String toString() {
		return "nome prodotto: " + getNome() + " | marca: " + getMarca() + " | prezzo senza IVA: € " + getPrezzo() 
		+ " | prezzo con IVA: € " + String.format("%.02f", prezzoFormattato());
	}
}
