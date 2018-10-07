package com.company.stock;

import com.company.model.ingredients.Ingredient;


public class Stock<T extends Ingredient> {

    private static Stock sInstance;

    private T t;

    private Stock(){}

    Stock(T t) {
        this.t = t;
    }

    public static Stock getInstance() {
        if (sInstance == null) {
            sInstance = new Stock();
        }
        return sInstance;
    }

    private float amount;
    private int quantity;
    private boolean notEnough = false;

    void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isNotEnough() {
        return notEnough;
    }

    void request(T unit) {
        if (unit.getAmount() <= amount) {
            amount -= unit.getAmount();
        } else {
            notEnough = true;
        }
    }

    void requestProduct(T unit) {
        if (quantity != 0) {
            --quantity;
        } else {
            notEnough = true;
        }
    }
}