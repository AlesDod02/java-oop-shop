package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("quanti prodotti devi inserire?");
        int numberOfProduct = Integer.parseInt(scan.nextLine());


        Prodotto[] listProducts = new Prodotto[numberOfProduct];

        try {
            for (int i = 0; i < listProducts.length; i++) {
                System.out.println("come si chiama il prodotto?");
                String nameProduct = scan.nextLine();
                System.out.println("aggiungi una descrizione del prodotto");
                String descProduct = scan.nextLine();
                System.out.println("quanto costa il prodotto?");
                double priceProduct = Double.parseDouble(scan.nextLine());
                System.out.println("quanta è l'iva?");
                int ivaProduct = Integer.parseInt(scan.nextLine());
                System.out.println("a che categoria appartiene ?");
                String nameCategory = scan.nextLine();
                System.out.println("inserisci descrizione categoria");
                String descCategory = scan.nextLine();
                Categoria newCategory = new Categoria(nameCategory, descCategory);
                Prodotto product = new Prodotto(nameProduct, descProduct, priceProduct, ivaProduct, newCategory);
                listProducts[i] = product;



            }
        } catch (IllegalArgumentException e) {
            System.out.println("invalid data:" + e.getMessage());
        }
        System.out.println("i tuoi prodotti");


            for (int j = 0; j < listProducts.length; j++) {
                Categoria category = listProducts[j].getCategoria();
                System.out.println("prodotto:" + listProducts[j].getName() + " " + listProducts[j].infoCode() + " " +
                        "descrizione:" + " " + listProducts[j].getDescription() + " " +
                        "prezzo" + " " + listProducts[j].getPrice() + "€" + " " +
                        "prezzo con iva:" + listProducts[j].priceIva() + "€" +
                        " Categoria: " + category.getNameCategory() + " " + category.getDescriptionCategory());
            }



            scan.close();


    }
}