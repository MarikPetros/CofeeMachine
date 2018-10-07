package com.company.model.beverages;

import com.company.model.ingredients.Sugar;
import com.company.model.ingredients.TeaType;

public class PeachTea extends Tea {
    private static final int PRICE = 250;
    private static final TeaType PEACH = new TeaType(TeaType.TeaLeaves.PEACH, 20.0f);
    private String sugarAmountCode = "0";

    public PeachTea() {
        super(PEACH);
    }
    public PeachTea(String sugarAmountCode) {
        super(PEACH);
        this.sugarAmountCode = sugarAmountCode;
    }

    public  Sugar getSugar(){
        return new Sugar(Juice.SUGAR,new Sugar(sugarAmountCode));
    }

    public int getPrice() {
        return PRICE;
    }

    @Override
    public String name() {
        return "Peach Tea";
    }

    public String toString(){
        return "Peach Tea";
    }

    public int productType(){ return 22;}
}
