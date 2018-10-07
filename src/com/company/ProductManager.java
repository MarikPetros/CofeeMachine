package com.company;

import com.company.model.Product;
import com.company.model.beverages.*;
import com.company.model.sweets.KitKat;
import com.company.model.sweets.Mars;
import com.company.model.sweets.Snickers;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProductManager {

        private static final String COMMAND_1 = "A1";
        private static final String COMMAND_2 = "A2";
        private static final String COMMAND_3 = "A3";
        private static final String COMMAND_4 = "B2";
        private static final String COMMAND_5 = "B1";
        private static final String COMMAND_6 = "C1";
        private static final String COMMAND_7 = "C2";
        private static final String COMMAND_8 = "C3";
        private static final String COMMAND_9 = "D1";
        private static final String COMMAND_10 = "D2";
        private static final String COMMAND_11 = "D3";

        private static Map<String, Product> productsMap = new LinkedHashMap<>();

        static {
            productsMap.put(COMMAND_1, new Cappuccino());
            productsMap.put(COMMAND_2, new Espresso());
            productsMap.put(COMMAND_3, new Macchiato());
            productsMap.put(COMMAND_4, new GreenTea());
            productsMap.put(COMMAND_5, new PeachTea());
            productsMap.put(COMMAND_6, new OrangeJuice());
            productsMap.put(COMMAND_7, new StrawberryJuice());
            productsMap.put(COMMAND_8, new AppleJuice());
            productsMap.put(COMMAND_9, new Snickers());
            productsMap.put(COMMAND_10, new Mars());
            productsMap.put(COMMAND_11, new KitKat());
        }

        public static Product getProductByCode(String code) throws IllegalArgumentException{
            if (!productsMap.containsKey(code)){
                throw new IllegalArgumentException();
            }
            return productsMap.get(code);
        }
}
