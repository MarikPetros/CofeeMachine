package com.company.model.beverages;

import com.company.model.ingredients.GroundCoffee;
import com.company.model.ingredients.MilkPowder;
import com.company.model.ingredients.Sugar;
import com.company.model.ingredients.Water;

public class Macchiato extends Coffee {


    private static final float COFFEE_AMOUNT = 20.0f;
    private static final float WATER_AMOUNT = 55.0f;
    private static final float MILK_AMOUNT = 10.0f;

    private static final int PRICE = 350;

    public Macchiato() {
        super();
    }

    public Macchiato(String sugarAmountCode) {
        super(sugarAmountCode);
    }

    @Override
    protected GroundCoffee initGroundCoffee() {
        return new GroundCoffee(GroundCoffee.GrndCoffee.ROBUSTA, COFFEE_AMOUNT);
    }

    @Override
    protected Sugar initSugar(String sugarAmountCode) {
        return new Sugar(sugarAmountCode);
    }

    @Override
    protected Water initWater() {
        return new Water(Water.WaterCondition.HOT, WATER_AMOUNT);
    }

    @Override
    protected MilkPowder initMilkPowder() {
        return new MilkPowder(MilkPowder.Milk.MILKPOWDER, MILK_AMOUNT);
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    public String toString() {
        return "Macchiato";
    }

    @Override
    public String name() {
        return "Macchiato";
    }

    public int productType(){ return 13;}
}
