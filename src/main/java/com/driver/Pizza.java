package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;
    private boolean extraCheese=false;
    private boolean extraToppings=false;
    private boolean takeaway=false;


    public Boolean getVeg() {
        return isVeg;
    }


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
       if(isVeg){
           total=300;
       }else{
           total=400;
       }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       total+=80;
       extraCheese=true;
    }

    public void addExtraToppings(){
        if(isVeg){
            total+=70;
        }else{
            total+=120;
        }
        extraToppings=true;
    }

    public void addTakeaway(){
       total+=20;

       takeaway=true;
    }

    public String getBill(){

        if(isVeg){
            this.bill="Base Price Of The Pizza: "+this.price+"\n";
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
