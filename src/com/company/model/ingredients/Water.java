package com.company.model.ingredients;

public class Water implements Ingredient{
    private WaterCondition waterCondition;
    private float amount;


    public Water(WaterCondition wc, float amount){
       this.waterCondition = wc;
       this.amount = amount;
    }

    public enum WaterCondition { HOT, COOL }

    public WaterCondition getWaterCondition() {
        return waterCondition;
    }

    public float getAmount() {
        return amount;
    }
}