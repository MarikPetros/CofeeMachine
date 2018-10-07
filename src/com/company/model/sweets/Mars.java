package com.company.model.sweets;

import com.company.model.ingredients.ChocolateBar;
import com.company.model.ingredients.Ingredient;

public class Mars extends Sweet implements Ingredient{
    private static final int PRICE = 300;
    public Mars() {
        super(ChocolateBar.MARS);
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public String name() {
        return "Mars";
    }

    public String toString(){
        return "Mars";
    }

    public int productType(){ return 42;}

    @Override
    public float getAmount() {
        return 1;
    }
}
