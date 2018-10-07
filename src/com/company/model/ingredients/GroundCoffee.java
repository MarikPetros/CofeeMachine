package com.company.model.ingredients;

public class GroundCoffee {
    private GrndCoffee grndCoffee;
    private static float amount;

    public GroundCoffee(GrndCoffee grndCoffee, float amount) {
        this.grndCoffee = grndCoffee;
        GroundCoffee.amount = amount;
    }

    public enum GrndCoffee implements Ingredient {
        ARABIKA, ROBUSTA;

        public float getAmount() {
            return GroundCoffee.amount;
        }
    }

    public GrndCoffee getGrndCoffee() {
        return grndCoffee;
    }

}
