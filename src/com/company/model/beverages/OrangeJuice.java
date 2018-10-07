package com.company.model.beverages;

import com.company.model.ingredients.Fruit;
import com.company.model.ingredients.Sugar;

public class OrangeJuice extends Juice {
    private static final int PRICE = 500;
    private static final Fruit ORANGE = new Fruit(Fruit.FruitType.ORANGE, 30.f);
    private String sugarAmountCode = "0";

    public OrangeJuice() {
        super(ORANGE);
    }

    public OrangeJuice(String sugarAmountCode) {
        super(ORANGE);
        this.sugarAmountCode = sugarAmountCode;
    }

    public  Sugar getSugar(){
        return new Sugar(Juice.SUGAR,new Sugar(sugarAmountCode));
    }

     public int getPrice() {
        return PRICE;
    }

    @Override
    public String name() {
        return "Orange Juice";
    }

    public String toString(){
        return "Orange Juice";
    }
    public int productType(){ return 31;}
}




