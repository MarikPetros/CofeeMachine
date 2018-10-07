package com.company.stock;

public class NotEnoughMilkPowderException extends NotEnoughIngredientsException {
    public NotEnoughMilkPowderException() {
        super("There is not enough Milk powder.");
    }

}
