package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = null;
		String marca = null;
		float prezzo = 0;
		int iva = 0;
		
		System.out.print("Selezionare il prodotto: digitare 1 per lo Smartphone | 2 per il Televisore | 3 per le Cuffie ");
		int tipoProdotto = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Inserire il nome: ");
		nome = sc.nextLine();
		System.out.print("Inserire la marca: ");
		marca = sc.nextLine();
		System.out.print("Inserire il prezzo: ");
		prezzo = sc.nextInt();
		System.out.print("Inserire la percentuale dell'IVA: ");
		iva = sc.nextInt();
		
		switch(tipoProdotto) {
		
	    case 1:	    	
			System.out.print("Inserire il codice IMIEI: ");
			int imei = sc.nextInt();
			System.out.print("Inserire la grandezza di memoria: ");
			int memoria = sc.nextInt();
			
			Smartphone telefono = new Smartphone(nome, marca, prezzo, iva, imei, memoria);
			System.out.println(telefono);
	        break;
	        
	    case 2:	    	
	    	System.out.print("Inserire la dimensione in pollici: ");
	    	int dimensione = sc.nextInt();
			System.out.print("Digitare 'Y' se è una smart TV altrimenti 'N': ");
			String smartTv = sc.next();
			
			Televisori televisore = new Televisori(nome, marca, prezzo, iva, dimensione, (smartTv.toLowerCase().equals("y") ? true : false));
			System.out.println(televisore);
	        break;
	        
	    case 3:
	    	sc.nextLine();
	    	System.out.print("Inserire il colore: ");
	    	String colore = sc.nextLine();
			System.out.print("Digitare 'Y' se sono wireless altrimenti 'N': ");
			String isCablate = sc.nextLine();
	    	
			Cuffie cuffie = new Cuffie(nome, marca, prezzo, iva, colore, (isCablate.toLowerCase().equals("y") ? true : false));
			System.out.println(cuffie);
	        break;
	        
	    default: 
	    	System.out.println("hai sbagliato a digitare!");
		}
		
		
	
	
	}

}
