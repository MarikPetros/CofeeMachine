package com.company.model.ingredients;

public enum ChocolateBar implements Ingredient {
    SNICKERS, MARS, KITKAT;

    @Override
    public float getAmount() {
        return 1;
    }

}
