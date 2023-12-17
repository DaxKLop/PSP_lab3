package org.example;

class Kefir implements MilkProduct, Object{
    private String expiration_date;
    private double count_protein;
    private double fatness;
    private double volume;

    public Kefir(String expiration_date, double count_protein, double fatness, double volume, double numberВifidobacteria) {
        this.expiration_date = expiration_date;
        this.count_protein = count_protein;
        this.fatness = fatness;git add README.md
        this.volume = volume;
        this.numberВifidobacteria = numberВifidobacteria;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getNumberВifidobacteria() {
        return numberВifidobacteria;
    }

    public void setNumberВifidobacteria(double numberВifidobacteria) {
        this.numberВifidobacteria = numberВifidobacteria;
    }

    private double numberВifidobacteria;

    public Kefir() {
    }

    public String getExpirationDate() {
        return expiration_date;
    }

    public void setExpirationDate(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public double getCountProtein() {
        return count_protein;
    }

    public void setCountProtein(double count_protein) {
        this.count_protein = count_protein;
    }

    @Override
    public double getFatness() {
        return fatness;
    }

    public void setFatness(double fatness) {
        this.fatness = fatness;
    }

    @Override
    public void print() {
        System.out.println("Kefir");
        System.out.println("Expiration date: " + getExpirationDate());
        System.out.println("Count of protein: " + getCountProtein());
        System.out.println("Fatness: " + getFatness());
    }
}
