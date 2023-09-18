package org.lessons.java.shop;

public class Main {
	
	public static void main(String[] args) {
		
		Prodotto prodotto1 = new Prodotto("15648", "telefono", "samsung", 2899, 22);
		Smartphone telefono1 = new Smartphone("468295", "telefono", "samsung", 2899, 22, 526489489, 128);
		
		System.out.println(prodotto1);
		System.out.println(telefono1);
	}	
	
}
