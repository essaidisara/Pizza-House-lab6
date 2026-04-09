package com.example.pizzarecipes.classes;

public class Produit {
    private static long essCompteurAuto = 1;

    private long essIdentifiant;
    private String essTitrePizza;
    private double essTarifPizza;
    private int essImagePizza;
    private String essTempsCuisson;
    private String essListeIngredients;
    private String essResumePizza;
    private String essEtapesPreparation;

    public Produit() {
        this.essIdentifiant = essCompteurAuto++;
    }

    public Produit(String essTitrePizza, double essTarifPizza, int essImagePizza, String essTempsCuisson,
                   String essListeIngredients, String essResumePizza, String essEtapesPreparation) {
        this.essIdentifiant = essCompteurAuto++;
        this.essTitrePizza = essTitrePizza;
        this.essTarifPizza = essTarifPizza;
        this.essImagePizza = essImagePizza;
        this.essTempsCuisson = essTempsCuisson;
        this.essListeIngredients = essListeIngredients;
        this.essResumePizza = essResumePizza;
        this.essEtapesPreparation = essEtapesPreparation;
    }

    public long getEssIdentifiant() {
        return essIdentifiant;
    }

    public String getEssTitrePizza() {
        return essTitrePizza;
    }

    public void setEssTitrePizza(String essTitrePizza) {
        this.essTitrePizza = essTitrePizza;
    }

    public double getEssTarifPizza() {
        return essTarifPizza;
    }

    public void setEssTarifPizza(double essTarifPizza) {
        this.essTarifPizza = essTarifPizza;
    }

    public int getEssImagePizza() {
        return essImagePizza;
    }

    public void setEssImagePizza(int essImagePizza) {
        this.essImagePizza = essImagePizza;
    }

    public String getEssTempsCuisson() {
        return essTempsCuisson;
    }

    public void setEssTempsCuisson(String essTempsCuisson) {
        this.essTempsCuisson = essTempsCuisson;
    }

    public String getEssListeIngredients() {
        return essListeIngredients;
    }

    public void setEssListeIngredients(String essListeIngredients) {
        this.essListeIngredients = essListeIngredients;
    }

    public String getEssResumePizza() {
        return essResumePizza;
    }

    public void setEssResumePizza(String essResumePizza) {
        this.essResumePizza = essResumePizza;
    }

    public String getEssEtapesPreparation() {
        return essEtapesPreparation;
    }

    public void setEssEtapesPreparation(String essEtapesPreparation) {
        this.essEtapesPreparation = essEtapesPreparation;
    }

    @Override
    public String toString() {
        return essTitrePizza + " - " + essTarifPizza + " €";
    }
}