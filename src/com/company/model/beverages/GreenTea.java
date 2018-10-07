package com.company.model.beverages;

import com.company.model.ingredients.Sugar;
import com.company.model.ingredients.TeaType;

public class GreenTea extends Tea {
    private static final int PRICE = 200;
    private static final TeaType GREEN = new TeaType(TeaType.TeaLeaves.GREEN_TEA, 15.0f);
    private String sugarAmountCode = "0";

    public GreenTea() {
        super(GREEN);
    }
    public GreenTea(String sugarAmountCode) {
        super(GREEN);
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
        return "Green Tea";
    }

    public String toString(){
        return "Green Tea";
    }

    public int productType(){ return 21;}
}
