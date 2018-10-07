package com.company.stock;

public class NotEnoughStrawberryException extends NotEnoughIngredientsException {
    public NotEnoughStrawberryException() {
        super("There is not enough strawberry.");
    }

}
