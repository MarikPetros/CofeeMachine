package com.company.model.beverages;

import com.company.model.ingredients.GroundCoffee;
import com.company.model.ingredients.MilkPowder;
import com.company.model.ingredients.Sugar;
import com.company.model.ingredients.Water;

public abstract class Coffee extends Beverage {

    private final GroundCoffee groundCoffee;
    private final Sugar sugar;
    private final Water water;
    private final MilkPowder milkPowder;

    Coffee() {
        this.groundCoffee = initGroundCoffee();
        this.sugar = new Sugar("0");
        this.water = initWater();
        this.milkPowder = initMilkPowder();
    }

    Coffee(String sugarAmountCode) {
        this.groundCoffee = initGroundCoffee();
        this.sugar = initSugar(sugarAmountCode);
        this.water = initWater();
        this.milkPowder = initMilkPowder();
    }

    protected abstract GroundCoffee initGroundCoffee();
    protected abstract Sugar initSugar(String sugarAmountCode);
    protected abstract Water initWater();
    protected abstract MilkPowder initMilkPowder();


    public GroundCoffee getGroundCoffee() {
        return groundCoffee;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public Water getWater() {
        return water;
    }

    public MilkPowder getMilkPowder() {
        return milkPowder;
    }

    public int productType(){ return 1;}
}
