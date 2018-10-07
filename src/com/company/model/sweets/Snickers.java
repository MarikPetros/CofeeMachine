package com.company.model.sweets;

import com.company.model.ingredients.ChocolateBar;
import com.company.model.ingredients.Ingredient;

public class Snickers extends Sweet implements Ingredient{
    private static final int PRICE = 300;
    public Snickers() {
        super(ChocolateBar.SNICKERS);
    }

    public String toString(){
        return "Snickers";
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public String name() {
        return "Snickers";
    }

    public int productType(){ return 41;}

    @Override
    public float getAmount() {
        return 1;
    }
}
