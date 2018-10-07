package com.company.ProductGetter;

import com.company.display.Display;
import com.company.model.Product;
import com.company.productmaker.WaitArrangerThread;
import com.company.stock.NotEnoughIngredientsException;
import com.company.stock.StockManager;

public class ProductGetterThread extends Thread{
    private Product product;
    public boolean productAbsent = false;
    private NotEnoughIngredientsException exception ;
    public ProductGetterThread(Product product){
        this.product = product;
    }

    @Override
    public void run(){

        try {
            StockManager.getInstance().getProduct(product);
        } catch (NotEnoughIngredientsException e) {
            Display.print(e.getMessage());
            productAbsent = true;
            exception = e;
            return;
        }

        new WaitArrangerThread(this).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public NotEnoughIngredientsException getException() {
        return exception;
    }
}
