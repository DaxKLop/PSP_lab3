package org.example;

public class YogurtInACup extends Yogurt{
    @Override
    public void print() {
        System.out.println("Expiration date: " + getExpirationDate());
        System.out.println("Count of protein: " + getCountProtein());
        System.out.println("Fatness: " + getFatness());
    }

    private String expiration_date;
    private double count_protein;
    private double fatness;

    public YogurtInACup(String expiration_date, double count_protein, double fatness) {
        this.expiration_date = expiration_date;
        this.count_protein = count_protein;
        this.fatness = fatness;
    }


    @Override
    public String getExpirationDate() {
        return expiration_date;
    }

    public double getCountProtein() {
        return count_protein;
    }

    public void setCountProtein(double count_protein) {
        this.count_protein = count_protein;
    }

    public double getFatness() {
        return fatness;
    }

    public void setFatness(double fatness) {
        this.fatness = fatness;
    }


    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public double getCount_protein() {
        return count_protein;
    }

    public void setCount_protein(double count_protein) {
        this.count_protein = count_protein;
    }

    @Override
    public String getExpiration_date() {
        return null;
    }
}
