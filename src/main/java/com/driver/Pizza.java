package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = this.isVeg ? 300 : 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheese) {
            extraCheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        if(!extraToppings) {
            extraToppings = true;
            this.price += isVeg ? 70 : 120;
        }
    }

    public void addTakeaway(){
        if(!takeAway) {
            takeAway = true;
            this.price += 20;
        }

    }

    public String getBill(){
        this.bill = "Base Price Of the Pizza: ";
        this.bill += this.isVeg ? "300" : "400";

        if(extraCheese) {
            this.bill += "\nExtra Cheese Added: " + 80;
        }

        if(extraToppings) {
            this.bill += isVeg ? "\nExtra Toppings Added: " + 70 : "\nExtra Toppings Added: " + 120 ;
        }

        if(takeAway){
            this.bill += "\nPaperbag Added: " + 20;
        }

        this.bill += "\nTotalPrice: "+this.price +"\n";
        return this.bill;
    }
}
