package com.company.model.beverages;

import com.company.model.ingredients.Fruit;
import com.company.model.ingredients.Sugar;

public class AppleJuice extends Juice {
    private static final int PRICE = 300;
    private static final Fruit APPLE = new Fruit(Fruit.FruitType.APPLE, 50.0f);
    private String sugarAmountCode = "0";

    public AppleJuice() {
        super(APPLE);
    }
    public AppleJuice(String sugarAmountCode) {
        super(APPLE);
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
        return "Apple Juice";
    }

    public String toString(){
        return "Apple Juice";
    }

    public int productType(){ return 33;}
}
