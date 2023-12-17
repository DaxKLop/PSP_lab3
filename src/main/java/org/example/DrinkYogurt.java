package org.example;

public class DrinkYogurt extends Yogurt {
    String expiration_date;
    double count_protein;
    double fatness;
    public DrinkYogurt(String expiration_date, double count_protein, double fatness) {
        super(expiration_date, count_protein, fatness);
    }

    @Override
    public void print() {
        System.out.println("Drink Yogurt");
        System.out.println("Expiration date: " + getExpirationDate());
        System.out.println("Count of protein: " + getCountProtein());
        System.out.println("Fatness: " + getFatness());
    }

    @Override
    public String getExpirationDate() {
        return null;
    }

    @Override
    public double getCountProtein() {
        return 0;
    }

    @Override
    public double getFatness() {
        return 0;
    }

    @Override
    public String getExpiration_date() {
        return null;
    }
}
