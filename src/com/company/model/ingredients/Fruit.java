package com.company.model.ingredients;

public class Fruit {
    public enum FruitType implements Ingredient{
        ORANGE, STRAWBERRY, APPLE;
        public float getAmount() {
            return Fruit.amount;
        }
    }
   private FruitType fruitType;
   private static float amount;


    public Fruit(FruitType fruitType1 , float amount){
        this.fruitType = fruitType1;
        Fruit.amount = amount;
    }

    public FruitType getFruitType() {
        return fruitType;
    }
}
