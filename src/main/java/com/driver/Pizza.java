package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese=false;
    private boolean extraToppings=false;
    private boolean takeaway=false;


    public Boolean getVeg() {
        return isVeg;
    }


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
       if(isVeg){
           price=300;
       }else{
           price=400;
       }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       price+=80;
       extraCheese=true;
    }

    public void addExtraToppings(){
        if(isVeg){
            price+=70;
        }else{
            price+=120;
        }
        extraToppings=true;
    }

    public void addTakeaway(){
       price+=20;
       takeaway=true;
    }

    public String getBill(){

        if(isVeg){
            this.bill="Base Price Of The Pizza: "+300+"\n";
        }else{
            this.bill="Base Price Of The Pizza: "+400+"\n";
        }
        if(extraCheese){
            this.bill+="Extra Cheese Added: "+80+"\n";
        }
        if(extraToppings && isVeg){
            this.bill+="Extra Toppings Added: "+70+"\n";
        }else if(extraToppings && !isVeg){
            this.bill+="Extra Toppings Added: "+120+"\n";
        }
        if(takeaway){
            this.bill+="Paperbag Added: "+20+"\n";
        }
        this.bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
