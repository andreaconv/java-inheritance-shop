package org.lessons.java.shop;

public class Prodotto {
	
	private String codice;
	private String nome;
	private String marca;
	private float  prezzo;
	private int iva;
	
	public Prodotto(String codice, String name, String marca, float prezzo, int iva) {
		
		setCodice(codice);
		setNome(name);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
		
	}
	
	//CODICE
	public String getCodice0() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
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
}
