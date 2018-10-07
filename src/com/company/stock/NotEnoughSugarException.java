package com.company.stock;

public class NotEnoughSugarException extends NotEnoughIngredientsException {
    public NotEnoughSugarException() {
        super("There is not enough sugar.");
    }

}
