package com.company.model.beverages;

import com.company.model.ingredients.Water;
import com.company.productmaker.ProductMaker;
import com.company.model.Product;

abstract class Beverage implements Product , ProductMaker.ShouldMake {

    protected final Water WATER = new Water(Water.WaterCondition.COOL, 80.0f);

    Beverage(){
       getWater();
    }

    public Water getWater() {
        return WATER;
    }
}
