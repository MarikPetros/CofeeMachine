package com.company.stock;

import com.company.model.Product;
import com.company.model.beverages.Coffee;
import com.company.model.beverages.Juice;
import com.company.model.beverages.Tea;
import com.company.model.ingredients.*;
import com.company.model.sweets.KitKat;
import com.company.model.sweets.Mars;
import com.company.model.sweets.Snickers;
import com.company.productmaker.ProductMaker;

import static com.company.stock.StockProvider.*;

/**
 * Created by stude on 11.05.2018
 */
public class StockManager {
    private static StockManager sInstance;

    public static StockManager getInstance() {
        if (sInstance == null) {
            sInstance = new StockManager();
        }
        return sInstance;
    }

    private StockManager() {
    }


    public void getIngredients(ProductMaker.ShouldMake product) throws NotEnoughIngredientsException {

        waterStock.request(product.getWater());
        if (waterStock.isNotEnough()) {
            StockProvider.fillWater();
            throw new NotEnoughWaterException();
        }

        sugarStock.request(product.getSugar());
        if (sugarStock.isNotEnough()) {
            StockProvider.fillSugar();
            throw new NotEnoughSugarException();
        }

        if (product.productType() == 11 || product.productType() == 12 || product.productType() == 13) {

            milkPowderStock.request(((Coffee) product).getMilkPowder());
            if (milkPowderStock.isNotEnough()) {
                StockProvider.fillMilkPowder();
                throw new NotEnoughMilkPowderException();
            }

            switch (product.productType()) {
                case 12:
                    arabikaCoffeeStock.request(((Coffee) product).getGroundCoffee().getGrndCoffee());
                    if (arabikaCoffeeStock.isNotEnough()) {
                        StockProvider.fillCoffee();
                        throw new NotEnoughArabikaException();
                    }
                    break;
                case 11:
                    robustaCoffeeStock.request(((Coffee) product).getGroundCoffee().getGrndCoffee());
                    if (robustaCoffeeStock.isNotEnough()) {
                        StockProvider.fillCoffee();
                        throw new NotEnoughRobustaException();
                    }
                    break;
                case 13:
                    robustaCoffeeStock.request(((Coffee) product).getGroundCoffee().getGrndCoffee());
                    if (robustaCoffeeStock.isNotEnough()) {
                        StockProvider.fillCoffee();
                        throw new NotEnoughRobustaException();
                    }
                    break;
            }
        } else if (product.productType() == 21 || product.productType() == 22) {
            switch (product.productType()) {
                case 21:
                    greenTeaLeavesStock.request(((Tea) product).getTea().getTeaLeaves());
                    if (greenTeaLeavesStock.isNotEnough()) {
                        StockProvider.fillTea();
                        throw new NotEnoughGreenTeaException();
                    }
                    break;
                case 22:
                    peachTeaLeavesStock.request(((Tea) product).getTea().getTeaLeaves());
                    if (peachTeaLeavesStock.isNotEnough()) {
                        StockProvider.fillTea();
                        throw new NotEnoughPeachException();
                    }
                    break;
            }
        } else if (product.productType() == 31 || product.productType() == 32 || product.productType() == 33) {
            switch (product.productType()) {
                case 31:
                    orangeStock.request(((Juice) product).getFruit().getFruitType());
                    if (orangeStock.isNotEnough())  {
                        StockProvider.fillFruit();
                        throw new NotEnoughOrangeException();
                    }
                    break;
                case 32:
                    strawberryStock.request(((Juice) product).getFruit().getFruitType());
                    if (strawberryStock.isNotEnough()) {
                        StockProvider.fillFruit();
                        throw new NotEnoughStrawberryException();
                    }
                    break;
                case 33:
                    appleStock.request(((Juice) product).getFruit().getFruitType());
                    if (appleStock.isNotEnough()) {
                        StockProvider.fillFruit();
                        throw new NotEnoughAppleException();
                    }
                    break;
            }
        }
    }

    public void getProduct(Product product) throws NotEnoughIngredientsException {
        switch (product.productType()) {
            case 41:
                snickersStock.requestProduct((Snickers) product);
                if (snickersStock.isNotEnough()){
                    StockProvider.fillSnickers();
                    throw new SnickersAbsentException();
                }
                break;
            case 42:
                marsStock.requestProduct((Mars) product);
                if (marsStock.isNotEnough()) {
                    StockProvider.fillMars();
                    throw new MarsAbsentException();
                }
                break;
            case 43:
                kitKatStock.requestProduct((KitKat) product);
                if (kitKatStock.isNotEnough()) {
                    StockProvider.fillKitkat();
                    throw new KitkatAbsentException();
                }
                break;
        }
    }
}
