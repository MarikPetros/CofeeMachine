package com.company.stock;

public class NotEnoughArabikaException extends NotEnoughIngredientsException {
    public NotEnoughArabikaException() {
        super("There is not enough coffee Arabika.");
    }

}
