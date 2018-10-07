package com.company.stock;

public class NotEnoughGreenTeaException extends NotEnoughIngredientsException {
    public NotEnoughGreenTeaException() {
        super("There is not enough Green Tea.");
    }

}
