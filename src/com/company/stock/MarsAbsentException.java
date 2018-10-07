package com.company.stock;

public class MarsAbsentException extends NotEnoughIngredientsException {
    MarsAbsentException(){
        super("There is not Mars.");
    }

}
