package com.company.stock;

public class KitkatAbsentException extends NotEnoughIngredientsException {
    KitkatAbsentException(){
        super("There is not Kitkat.");
    }

}
