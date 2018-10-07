package com.company.main;


import com.company.CoinReader;
import com.company.ProductGetter.ProductGetterThread;
import com.company.ProductManager;
import com.company.model.Product;
import com.company.model.Saleable;
import com.company.productmaker.ProductMaker;
import com.company.display.Display;
import com.company.productmaker.ProductMakerThread;
import com.company.stock.StockProvider;

import java.util.Scanner;

public class MainController {

    private static MainController sInstance;

    public static MainController getsInstance() {
        if (sInstance == null) {
            sInstance = new MainController();
        }

        return sInstance;
    }

    private MainController() {

    }

    public void start() {
        fillAllStocks();
        Display.print("Welcome to ACA CoffeeMachine\n",
                "Please insert coin and choose product");
        Scanner scanner = new Scanner(System.in);

        // flag in case of inserting money less than the price
        boolean mustKeepInsertedAmount = false;

        int insertedAmount = 0;
        do {
            if (!mustKeepInsertedAmount) {
                insertedAmount = 0;
            }
            Product product;
            boolean addSugar = false;

            do {
                if (scanner.hasNextInt()) {
                    int currentAmount = CoinReader.getsInstance()
                            .readCoin(scanner.nextInt());
                    if (currentAmount == -1) {
                        Display.printError("Wrong coin");
                        continue;
                    }

                    insertedAmount += currentAmount;

                } else {
                    try {
                        // TODO make variable for product code, and by if statement control product to be offered
                        product = ProductManager.getProductByCode(scanner.next());
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                        Display.printError(" Insert right code, please!");
                        continue;
                    }
                    if (product == null) {
                        Display.printError("Wrong code");
                    } else {
                        break;
                    }
                }
            } while (true);

            //TODO sugar adding choose

            boolean cantOfferProduct = false;
            if (isEnoughMoney(insertedAmount, product)) {
                mustKeepInsertedAmount = false;
                try {
                    if ((product instanceof ProductMaker.ShouldMake)) {
                        ProductMakerThread makerThread = new ProductMakerThread((ProductMaker.ShouldMake) product);
                        makerThread.start();
                        Display.print("Your " + product.name() + " is preparing. Please wait.");
                        makerThread.join();
                        if (makerThread.isNotEnoughIngredients) {
                            cantOfferProduct = true;
                        }
                    } else {
                        ProductGetterThread getterThread = new ProductGetterThread(product);
                        getterThread.start();
                        Display.print("Your " + product.name() + "!");
                        getterThread.join();
                        if (getterThread.productAbsent) {
                            cantOfferProduct = true;
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (cantOfferProduct) {
                    Display.print("Sorry. Can't comply your request.\nPlease, take your money " + insertedAmount);
                } else {
                    int change = insertedAmount - product.getPrice();
                    if (change > 0) {
                        Display.print("Please take your change: " + change);
                    }
                    Display.printFormatted("Your " + product.name() + ". Enjoy!\nThank you for purchase!\n\n");
                }
            } else {
                Display.printError("There is not enough money!\n Please insert " + (product.getPrice()- insertedAmount) + " dram.");
                mustKeepInsertedAmount = true;
                // TODO keeping product code
            }

        } while (true);
    }

    private boolean isEnoughMoney(int money, Saleable product) {
        return money >= product.getPrice();
    }

    private void fillAllStocks() {
        StockProvider.fillWater();
        StockProvider.fillSugar();
        StockProvider.fillKitkat();
        StockProvider.fillMars();
        StockProvider.fillMilkPowder();
        StockProvider.fillCoffee();
        StockProvider.fillTea();
        StockProvider.fillSnickers();
        StockProvider.fillFruit();

    }

    private void printSugarTable() {
        Display.print(" For adding sugar amount select\n",
                " for 4gr press     '1'\n",
                " for 8gr press     '2'\n",
                " for 10gr press    '3'\n",
                " for 12gr press    '4'\n",
                " for 15gr press    '5'\n");
    }
}
