package com.company;

import java.util.List;

public class Main {
    List<String> roman = List.of("N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C");
    List<String> arab = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    int arab1 = 0;
    int arab2 = 0;

    /*      Порядок действий:
    1.Проверка листа на римские
    2.Перевод римских в арабские
    3.Проверка на знаки
    4.Проверка листа на арабские
    5.Проверка на знаки
    6.Если проверка не проходит, то выкинуть ошибку
     */
    public String calc(String inputString) {

        String[] a = inputString.split(" ");

        if (a.length != 3) {
            throw new RuntimeException("Одно из условий было не выполнено!Введите символы от 1 до 10");
        }

        if (roman.contains(a[0]) && roman.contains(a[2])) { // Проверка на римские
            for (int i = 1; i < 10; i++) {                  //
                if (a[0].equals(roman.get(i))) {            //Перевод из римских в арабские(Первое число)
                    arab1 = i;                              //
                }
            }
            for (int i = 1; i < 10; i++) {                  //
                if (a[2].equals(roman.get(i))) {            //Перевод из римских в арабские(Второе число)
                    arab2 = i;                              //
                }
            }

            int result = 0;

            switch (a[1]) {   //Проверка знаков

                case "+":
                    result = arab1 + arab2;
                    break;
                case "-":
                    result = arab1 - arab2;
                    break;
                case "*":
                    result = arab1 * arab2;
                    break;
                case "/":
                    result = arab1 / arab2;
                    break;
                default:
                    throw new IllegalArgumentException("Не верный знак операции");

            }

            if(result < 1){
                throw new RuntimeException("Результатом вычислений римских чисел могут быть только положительные числа!");
            }
            return roman.get(result);

        }
        if (arab.contains(a[0]) && arab.contains(a[2])) {   //Проверка на арабские
            int arabResult = 0;
            switch (a[1]) {   //Проверка знаков
                case "+":
                    arabResult = Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
                    break;
                case "-":
                    arabResult = Integer.parseInt(a[0]) - Integer.parseInt(a[2]);
                    break;
                case "*":
                    arabResult = Integer.parseInt(a[0]) * Integer.parseInt(a[2]);
                    break;
                case "/":
                    arabResult = Integer.parseInt(a[0]) / Integer.parseInt(a[2]);
                    break;
                default:
                    throw new IllegalArgumentException("Не верный знак операции");
            }

            return "" + arabResult;


        } else {

            throw new RuntimeException("Одно из условий было не выполнено! Подавайте либо арабские, либо римские числа.");

        }
    }
}




