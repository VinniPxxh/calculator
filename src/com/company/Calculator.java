package com.company;

public class Calculator {
    public static void main(String[] args) {
        Main main = new Main();
    main.calc("II + II");
        System.out.println(main.calc("II + II"));
        System.out.println(main.calc("II + III"));
        System.out.println(main.calc("2 * 2"));
        System.out.println(main.calc("2 * 5"));
        System.out.println(main.calc("II ? II"));
        System.out.println(main.calc("2 * V"));
    }
}
