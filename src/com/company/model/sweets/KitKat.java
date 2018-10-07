package com.company.model.sweets;

import com.company.model.ingredients.ChocolateBar;
import com.company.model.ingredients.Ingredient;

public class KitKat extends Sweet implements Ingredient{
    private static final int PRICE = 250;
    public KitKat() {
        super(ChocolateBar.KITKAT);
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public String name() {
        return "KitKat";
    }

    public String toString(){
        return "KitKat";
    }

    public int productType(){ return 43;}

    @Override
    public float getAmount() {
        return 1;
    }
}
