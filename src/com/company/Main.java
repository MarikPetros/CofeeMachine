package com.company;

import com.company.main.MainController;
import com.company.model.*;
import com.company.model.beverages.*;
import com.company.model.sweets.KitKat;
import com.company.model.sweets.Mars;
import com.company.model.sweets.Snickers;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main(String[] args) {
        MainController.getsInstance().start();

    }
}
