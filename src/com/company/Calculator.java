package com.company;

public class Calculator {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println( main.calc("2 + 2"));
        System.out.println( main.calc("II + X"));
        System.out.println( main.calc("4 + V"));
        System.out.println( main.calc("0 + 11"));

    }
}
