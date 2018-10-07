package com.company.model.beverages;

import com.company.model.ingredients.Sugar;
import com.company.model.ingredients.TeaType;

public abstract class Tea extends Beverage {
    private TeaType teaType;
    protected final static Sugar SUGAR = new Sugar("2");

    Tea(TeaType teaType){
        this.teaType = teaType;
    }

    public TeaType getTea() {
        return teaType;
    }
    public int productType(){ return 2;}
}
