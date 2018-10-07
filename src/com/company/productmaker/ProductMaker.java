package com.company.productmaker;


import com.company.model.Product;
import com.company.model.ingredients.Sugar;
import com.company.model.ingredients.Water;
import com.company.stock.NotEnoughIngredientsException;
import com.company.stock.StockManager;

/**
 * Class for preparing products
 */
public class ProductMaker {

    private static ProductMaker sInstance;

    public static ProductMaker getInstance() {
        if (sInstance == null) {
            sInstance = new ProductMaker();
        }
        return sInstance;
    }

    private ProductMaker() {

    }

    public void make(ShouldMake product) throws NotEnoughIngredientsException {
        StockManager.getInstance().getIngredients(product);
    }

    public interface ShouldMake extends Product{
        Sugar getSugar();
        Water getWater();
    }
}
