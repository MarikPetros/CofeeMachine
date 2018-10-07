package com.company.model.beverages;

import com.company.model.ingredients.Fruit;
import com.company.model.ingredients.Sugar;

public class StrawberryJuice extends Juice {
    private static final int PRICE = 500;
    private static final Fruit SRTAWBERRY = new Fruit(Fruit.FruitType.STRAWBERRY, 30.f);

    private String sugarAmountCode = "0";

    public StrawberryJuice() {
        super(SRTAWBERRY);
    }


    public StrawberryJuice(String sugarAmountCode) {
        super(SRTAWBERRY);
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
        return "Strawberry Juice";
    }

    public String toString(){
        return "Strawberry Juice";
    }

    public int productType(){ return 32;}
}
