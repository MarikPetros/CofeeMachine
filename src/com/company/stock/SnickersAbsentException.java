package com.company.stock;

public class SnickersAbsentException extends NotEnoughIngredientsException {

    public SnickersAbsentException() {
        super("There is not Snickers.");
    }
}
