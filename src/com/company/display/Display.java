package com.company.display;

import java.util.Arrays;

public class Display {
    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(String... texts) {
        System.out.println(Arrays.toString(texts));
    }

    public static void printFormatted(String text) {
        System.out.println(text);
    }

    public static void printError(String text) { System.out.println(text); }
}
