package com.company.stock;

public class NotEnoughOrangeException extends NotEnoughIngredientsException {
    public NotEnoughOrangeException() {
        super("There is not enough Orange.");
    }

}
