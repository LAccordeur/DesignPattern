package com.guoyang.beverage.after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            return "no";
        }

        return answer;

    }
}
