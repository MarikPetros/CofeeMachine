package com.company.model.ingredients;

public class TeaType {
    private TeaLeaves teaLeaves;
    private static float amount;

    public TeaType(TeaLeaves teaLeaves, float amount) {
        this.teaLeaves = teaLeaves;
        TeaType.amount = amount;
    }

    public enum TeaLeaves implements Ingredient {
        GREEN_TEA, PEACH;

        public float getAmount() {
            return TeaType.amount;
        }
    }

    public TeaLeaves getTeaLeaves() {
        return teaLeaves;
    }


}