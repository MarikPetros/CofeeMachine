package com.company.stock;

public class NotEnoughIngredientsException extends Exception {
    private String message;

    public NotEnoughIngredientsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
