package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinReader {

    private static CoinReader sInstance;

    public static CoinReader getsInstance() {
        if (sInstance == null) {
            sInstance = new CoinReader();
        }

        return sInstance;
    }

    private CoinReader() {

    }

    public static List<Integer> validCoins = new ArrayList<>();

    static {
        validCoins.add(50);
        validCoins.add(100);
        validCoins.add(200);
        validCoins.add(500);
    }

    /**
     * @return Correct coin amount or -1 if not valid
     */
    public int readCoin(int amount) {
        if (validCoins.contains(amount)) {
            return amount;
        } else return -1;
    }
}
