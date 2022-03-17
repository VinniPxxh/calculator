package com.company;

import java.util.List;

public class Main {
    List<String> roman = List.of("O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C");
    List<Integer> arab = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
/*      Порядок действий:
1.Проверка листа на римские
2.Перевод римских в арабские
3.Проверка на знаки
4.Проверка листа на арабские
5.Проверка на знаки
6.Если проверка не проходит, то выкинуть ошибку
 */
    public String calc(String inputString) {
        System.out.println(inputString);

        System.out.println(inputString);
        String[] a = inputString.split(" ");


        if (roman.contains(a[0]) && roman.contains(a[2])) {
            for (int i = 0; i < 10; i++){
                if (a[0].equals(roman.get(i))){
                    int arab1 = i;
                }
            }
            for (int i = 0; i < 10; i++){
                if (a[2].equals(roman.get(i))){
                    int arab2 = i;
                }
            }
            int result = 0;


            switch (a[1]) {

                case "+":
                    result = arab1 + arab2;
                    break;
                case "-":
                    result = Integer.parseInt(a[0] - Integer.parseInt(a[2]);
                    break;
                case "*":
                    result = Integer.parseInt(a[0]) * Integer.parseInt(a[2]);
                    break;
                case "/":
                    result = Integer.parseInt(a[0]) / Integer.parseInt(a[2]);
                    break;

            }

            return "" + result;

        }
        return inputString;
    }
}




