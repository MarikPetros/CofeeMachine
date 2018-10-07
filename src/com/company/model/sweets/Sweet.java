package com.company.model.sweets;

import com.company.model.Product;
import com.company.model.ingredients.ChocolateBar;

public abstract class Sweet implements Product {
   private ChocolateBar chocolateBar;


    Sweet(ChocolateBar chocolateBar){
        this.chocolateBar = chocolateBar;
    }

    public ChocolateBar getChocolateBar() {
        return chocolateBar;
    }

    public int productType(){ return 4;}
}
