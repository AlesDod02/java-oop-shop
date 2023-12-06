package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("quanti prodotti devi inserire?");
        int numberOfProduct = Integer.parseInt(scan.nextLine());


        Prodotto[] listProducts = new Prodotto[numberOfProduct];

        for (int i=0;i<listProducts.length;i++){
            System.out.println("come si chiama il prodotto?");
            String nameProduct = scan.nextLine();
            System.out.println("aggiungi una descrizione del prodotto");
            String descProduct = scan.nextLine();
            System.out.println("quanto costa il prodotto?");
            double priceProduct = Double.parseDouble(scan.nextLine());
            Prodotto product = new Prodotto(nameProduct,descProduct,priceProduct);
            listProducts[i]=product;



        }
        System.out.println("i tuoi prodotti");
        for (int i=0; i<listProducts.length;i++){
            System.out.println("prodotto:"+ listProducts[i].getName()+" " + listProducts[i].getCode() +" "+ "descrizione:"+ " "+ listProducts[i].getDescription()+ " " + "prezzo"+" "+ listProducts[i].getPrice()+"€"+ " " + "prezzo con iva:"+ listProducts[i].getIva()+"€");
        }




        scan.close();
    }
}
