package com.company.stock;

public class NotEnoughWaterException extends NotEnoughIngredientsException {
    public NotEnoughWaterException() {
        super("There is not enough water.");
    }

}
