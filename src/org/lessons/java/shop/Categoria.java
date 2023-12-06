package org.lessons.java.shop;

public class Categoria {
    //ATTRIBUTI
    private String nameCategory;

    private String descriptionCategory;

    //COSTRUTTORI

    public Categoria(String name, String description) {
        this.nameCategory = name;
        this.descriptionCategory = description;
    }


    //GET AND SET

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getDescriptionCategory() {
        return descriptionCategory;
    }

    public void setDescriptionCategory(String description) {
        this.descriptionCategory = description;
    }

    //MODULI


    public String category(){
        return nameCategory +" "+descriptionCategory;
   }



}
