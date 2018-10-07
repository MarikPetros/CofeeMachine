package com.company.model.ingredients;

public class MilkPowder implements Ingredient{
    private MilkPowder.Milk mp;
    private float amount;

    public MilkPowder(Milk mp, float amount){
        this.mp = mp;
        this.amount = amount;
    }

    public enum Milk { MILKPOWDER }

    public Milk getMp() {
        return mp;
    }

    public float getAmount() {
        return amount;
    }
}
