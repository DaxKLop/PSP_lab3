package org.example;

 class Curd implements MilkProduct, Object{
    private String expiration_date;
    private double count_protein;
    private double fatness;
    private double weight;
    private double grain;

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

     public double getFatness() {
         return fatness;
     }

     public void setFatness(double fatness) {
         this.fatness = fatness;
     }

     public double getWeight() {
         return weight;
     }

     public void setWeight(double weight) {
         this.weight = weight;
     }

     public double getGrain() {
         return grain;
     }

     public void setGrain(double grain) {
         this.grain = grain;
     }

     public Curd(String expiration_date, double count_protein, double fatness, double weight, double grain) {
         this.expiration_date = expiration_date;
         this.count_protein = count_protein;
         this.fatness = fatness;
         this.weight = weight;
         this.grain = grain;
     }

     public Curd() {
    }

     @Override
     public void print() {
         System.out.println("Curd");
         System.out.println("Expiration date: " + getExpirationDate());
         System.out.println("Count of protein: " + getCountProtein());
         System.out.println("Fatness: " + getFatness());


     }
 }
