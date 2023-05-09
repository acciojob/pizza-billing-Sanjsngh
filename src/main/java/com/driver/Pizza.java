//package com.driver;
//
//public class Pizza {
//
//    private int price;
//    private Boolean isVeg;
//    private String bill;
//    private int toppings;
//
//    private boolean extraCheeseAdded;
//    private boolean extraToppingsAdded;
//    private boolean takeAway;
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        this.price = this.isVeg ? 300 : 400;
//        this.toppings = this.isVeg ? 70 : 120;
//        this.extraCheeseAdded = false;
//        this.extraToppingsAdded = false;
//        this.takeAway = false;
//
//        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
//    }
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        if(!extraCheeseAdded) {
//            this.extraCheeseAdded = true;
//            this.price += 80;
//        }
//    }
//
//    public void addExtraToppings(){
//        if(!extraToppingsAdded) {
//            this.extraToppingsAdded = true;
//            this.price += this.toppings;
//        }
//    }
//
//    public void addTakeaway(){
//        if(!takeAway) {
//            this.takeAway = true;
//            this.price += 20;
//        }
//
//    }
//
//    public String getBill(){
//        if(extraCheeseAdded) {
//            this.bill += "Extra Cheese Added: 80"+"\n";
//        }
//
//        if(extraToppingsAdded) {
//            this.bill += "Extra Toppings Added: " + this.toppings+"\n";
//        }
//
//        if(takeAway){
//            this.bill += "Paperbag Added: 20" + "\n";
//        }
//
//        this.bill += "Total Price: "+this.price;
//        return this.bill;
//
//
//
//    }
//}

package com.driver;

public class Pizza {

    public int cheesePrice;
    public int basePrice;
    public int toppingsPrice;
    public int paperBagPrice;

    public String bill;
    public int totalPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        if(isVeg) {
            basePrice = 300;
            toppingsPrice = 70;
        } else {
            basePrice = 400;
            toppingsPrice = 120;
        }
        cheesePrice = 80;
        paperBagPrice = 20;

        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;
        isBillGenerated = false;

        totalPrice += basePrice;
        bill = "Base Price Of The Pizza: " + basePrice + "\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded) {
            this.totalPrice = this.totalPrice + cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded) {
            this.totalPrice = this.totalPrice + toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperBagAdded) {
            this.totalPrice = this.totalPrice + paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated) {
            if(isCheeseAdded) {
                bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if(isToppingsAdded) {
                bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if(isPaperBagAdded) {
                bill += "Paperbag Added: " + paperBagPrice + "\n";
            }
            bill += "Total Price: " + totalPrice + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
