package com.company.stock;

public class NotEnoughAppleException extends NotEnoughIngredientsException {
    NotEnoughAppleException(){
        super("There is not enough apple.");
    }
}
