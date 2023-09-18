package org.lessons.java.shop;

public class Main {
	
	public static void main(String[] args) {
		
		Prodotto prodotto1 = new Prodotto("15648", "telefono", "samsung", 2899, 22);
		Smartphone telefono1 = new Smartphone("468295", "telefono", "samsung", 2899, 22, 526489489, 128);
		Televisori televisore1 = new Televisori("15648", "televisore", "samsung", 2899, 22, 65, true);
		Cuffie cuffie1 = new Cuffie("15648", "cuffie", "samsung", 255, 22, "bianche", true);
		
		System.out.println(prodotto1);
		System.out.println(telefono1);
		System.out.println(televisore1);
		System.out.println(cuffie1);
	}	
	
}
