package com.company.model.ingredients;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sugar implements Ingredient{
   private static final String CODE0 = "0";
   private static final String CODE1 = "1";
   private static final String CODE2 = "2";
   private static final String CODE3 = "3";
   private static final String CODE4 = "4";
   private static final String CODE5 = "5";

    private static Map<String, Float> sugarCodes = new LinkedHashMap<>();

    static {
        sugarCodes.put(CODE0, 0.0f);
        sugarCodes.put(CODE1, 4.0f);
        sugarCodes.put(CODE2, 8.0f);
        sugarCodes.put(CODE3, 10.0f);
        sugarCodes.put(CODE4, 12.0f);
        sugarCodes.put(CODE5, 15.0f);
    }

    private float amount;

    public Sugar(String amountCode){
      amount = sugarCodes.get(amountCode);
   }
    public Sugar(Sugar s1, Sugar s2){
        amount = s1.amount + s2.amount;
    }

    public float getAmount() {
        return amount;
    }

}
