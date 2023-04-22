package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;

    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean isBillCreated;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = this.isVeg ? 300 : 400;
        this.toppings = this.isVeg ? 70 : 120;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.isBillCreated = false;
        this.takeAway = false;

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheeseAdded) {
            this.extraCheeseAdded = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        if(!extraToppingsAdded) {
            this.extraToppingsAdded = true;
            this.price += this.toppings;
        }
    }

    public void addTakeaway(){
        if(!takeAway) {
            this.takeAway = true;
            this.price += 20;
        }

    }

    public String getBill(){
        if(!isBillCreated) {
            if(extraCheeseAdded) {
                this.bill += "Extra Cheese Added: 80"+"\n";
            }

            if(extraToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.toppings+"\n";
            }

            if(takeAway){
                this.bill += "Paperbag Added: 20" + "\n";
            }

            this.bill += "Total Price: "+this.price;
            this.isBillCreated = true;
            return this.bill;
        }

        return "";
    }
}
