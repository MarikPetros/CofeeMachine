package com.company.model.beverages;

import com.company.model.ingredients.Fruit;
import com.company.model.Product;
import com.company.model.ingredients.Sugar;

public abstract class Juice extends Beverage {

    private Fruit fruit;
    protected final static Sugar SUGAR = new Sugar("3");

    Juice(Fruit fruit){
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public int productType(){ return 3;}
}
