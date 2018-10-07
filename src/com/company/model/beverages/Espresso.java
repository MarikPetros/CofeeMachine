package com.company.model.beverages;

import com.company.model.ingredients.GroundCoffee;
import com.company.model.ingredients.MilkPowder;
import com.company.model.ingredients.Sugar;
import com.company.model.ingredients.Water;

public class Espresso extends Coffee {

        private static final float COFFEE_AMOUNT = 20.0f;
        private static final float WATER_AMOUNT = 65.0f;
        private static final float MILK_AMOUNT = 0.0f;

        private static final int PRICE = 100;

        public Espresso() {
            super();
        }

        public Espresso(String sugarAmountCode){
            super(sugarAmountCode);
        }

    @Override
    protected GroundCoffee initGroundCoffee() {
        return new GroundCoffee(GroundCoffee.GrndCoffee.ARABIKA, COFFEE_AMOUNT);
    }

    @Override
    protected Sugar initSugar(String sugarAmountCode) {
        return new Sugar(sugarAmountCode);
    }

    @Override
    protected Water initWater() {
        return new Water(Water.WaterCondition.HOT,WATER_AMOUNT);
    }

    @Override
    protected MilkPowder initMilkPowder() {
        return new MilkPowder(MilkPowder.Milk.MILKPOWDER, MILK_AMOUNT);
    }


    @Override public int getPrice() {
            return PRICE;
        }

    @Override
    public String name() {
        return "Espresso";
    }

    public int productType(){ return 12;}
}
