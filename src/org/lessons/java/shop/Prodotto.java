package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    //ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;
    private Categoria categoria;

    //COSTRUTTORI

    public Prodotto(String name, String description, double price, int iva, Categoria categoria) throws IllegalArgumentException {
        if (name == null || name.isEmpty() ){throw new IllegalArgumentException("devi inserire un nome valido");}
        if (description == null || description.isEmpty() ){throw new IllegalArgumentException("devi inserire una descrizione valida");}
        if (price<0 ){throw new IllegalArgumentException("devi inserire un numero valido");}
        if (iva<0 ){throw new IllegalArgumentException("devi inserire un'iva valida");}
        if (categoria == null ){throw new IllegalArgumentException("devi inserire una categoria valida");}
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        this.categoria=categoria;
    }


    //GET AND SET

    public int getCode() {
        int codeProduct = randomCode.nextInt(1000000,99999999);
        return codeProduct;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
    public Categoria getCategoria() {
        return categoria;
    }

   /* public double getIva() {
        double priceIva = price * 1.22;
        return priceIva;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //MODULI
    Random randomCode = new Random();

    public int codeProduct = randomCode.nextInt(1000000,99999999);

    public double priceIva (){
        return price + (price*iva/100);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public String infoCode(){
        return name+"-"+codeProduct;
    }


}
