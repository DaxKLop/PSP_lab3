package org.example;

abstract class Yogurt implements MilkProduct, Object{
    String expiration_date;
    double count_protein;
    double fatness;

    public Yogurt(String expirationDate, double countProtein, double fatness) {
    }

    public abstract String getExpiration_date();
}
