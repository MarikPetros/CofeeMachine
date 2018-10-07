package com.company.productmaker;
import com.company.display.Display;
import com.company.stock.NotEnoughIngredientsException;

public class ProductMakerThread extends Thread {
    private ProductMaker.ShouldMake product;
    public boolean isNotEnoughIngredients = false;
    private NotEnoughIngredientsException exception ;

    public ProductMakerThread(ProductMaker.ShouldMake product){
        this.product = product;
    }

    @Override
    public void run(){

        try {
            ProductMaker.getInstance().make(product);
        } catch (NotEnoughIngredientsException e) {
            Display.print(e.getMessage());
            isNotEnoughIngredients = true;
            exception = e;
            return;
        }

        new WaitArrangerThread(this).start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public NotEnoughIngredientsException getException() {
        return exception;
    }
}
