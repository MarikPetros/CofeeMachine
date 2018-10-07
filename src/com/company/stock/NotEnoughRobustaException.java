package com.company.stock;

public class NotEnoughRobustaException extends NotEnoughIngredientsException {
    NotEnoughRobustaException(){
        super("There is not enough coffee Robusta.");
    }
}
