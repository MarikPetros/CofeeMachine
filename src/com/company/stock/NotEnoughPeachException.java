package com.company.stock;

public class NotEnoughPeachException extends NotEnoughIngredientsException {
    public NotEnoughPeachException() {
        super("There is not enough Peach leaves.");
    }

}
