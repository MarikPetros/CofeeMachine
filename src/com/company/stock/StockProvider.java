package com.company.stock;

import com.company.model.ingredients.*;
import com.company.model.sweets.KitKat;
import com.company.model.sweets.Mars;
import com.company.model.sweets.Snickers;

public class StockProvider {
    static Stock<Water> waterStock = Stock.getInstance();
    static Stock<Sugar> sugarStock = Stock.getInstance();
    static Stock<MilkPowder> milkPowderStock = Stock.getInstance();
    static Stock<GroundCoffee.GrndCoffee> arabikaCoffeeStock = new Stock<>(GroundCoffee.GrndCoffee.ARABIKA);
    static Stock<GroundCoffee.GrndCoffee> robustaCoffeeStock = new Stock<>(GroundCoffee.GrndCoffee.ROBUSTA);
    static Stock<TeaType.TeaLeaves> peachTeaLeavesStock = new Stock<>(TeaType.TeaLeaves.PEACH);
    static Stock<TeaType.TeaLeaves> greenTeaLeavesStock = new Stock<>(TeaType.TeaLeaves.GREEN_TEA);
    static Stock<Fruit.FruitType> orangeStock = new Stock<>(Fruit.FruitType.ORANGE);
    static Stock<Fruit.FruitType> strawberryStock = new Stock<>(Fruit.FruitType.STRAWBERRY);
    static Stock<Fruit.FruitType> appleStock = new Stock<>(Fruit.FruitType.APPLE);
    static Stock<Snickers> snickersStock = Stock.getInstance();
    static Stock<Mars> marsStock = Stock.getInstance();
    static Stock<KitKat> kitKatStock = Stock.getInstance();


    public static void fillWater() {
        waterStock.setAmount(10000.0f);
    }

    public static void fillSugar() {
        sugarStock.setAmount(1000.0f);
    }

    public static void fillMilkPowder() {
        milkPowderStock.setAmount(1000.0f);
    }

    public static void fillCoffee() {
        arabikaCoffeeStock.setAmount(1000.0f);
        robustaCoffeeStock.setAmount(2000.0f);
    }

    public static void fillTea() {
        peachTeaLeavesStock.setAmount(1000.0f);
        greenTeaLeavesStock.setAmount(1000.0f);
    }

    public static void fillFruit() {
        orangeStock.setAmount(1000.0f);
        strawberryStock.setAmount(1000.0f);
        appleStock.setAmount(1000.0f);
    }

    public static void fillSnickers() {
        snickersStock.setQuantity(200);
    }

    public static void fillMars() {
        marsStock.setQuantity(100);
    }

    public static void fillKitkat() {
        kitKatStock.setQuantity(100);
    }
}
