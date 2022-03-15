package com.company;
import java.util.List;

public class Main {

    public String calc(String inputString) {
        inputString = "1 2 3 4 5 6 7 8 9 0";
        String[] a = inputString.split(" ");
        String operations = "+ - * /";
        String [] op = operations.split(" ");



        if (a.length != 3) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        List<String> roman = List.of("O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C");
        if (roman.contains(a[0]) && roman.contains(a[2]) && roman.add(op[1])) {
            int result = 0;
            switch (operations) {
                case "+":
                    result = Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
                    break;
                case "-":
                    result = Integer.parseInt(a[0]) - Integer.parseInt(a[2]);
                    break;
                case "*":
                    result = Integer.parseInt(a[0]) * Integer.parseInt(a[2]);
                    break;
                case "/":
                    result = Integer.parseInt(a[0]) / Integer.parseInt(a[2]);
                    break;

            }return result;
//        int result = 0;
//        switch (a[1]) {
//            case "+":
//                result = Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
//                return result;
//
////                case '-':
////                    result = num1 - num2;
////                    break;
////                case '*':
////                    result = num1 * num2;
////                    break;
////                case '/':
////                    result = num1 / num2;
////                    break;
//
//            class CalculatroHeper {
//                String convertNumToRoman(int numArabian){
//
//                    List<String> roman = new list.of{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
//                            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
//                            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
//                            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
//                            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
//                            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
//                            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
//                    String s = roman[numArabian];
//                    return s;
        }
//
//                int romanToNumber(String roman) {
//                    if (roman.equals("I")) {
//                        return 1;
//                    } else if (roman.equals("II")) {
//                        return 2;
//                    } else if (roman.equals("III")) {
//                        return 3;
//                    } else if (roman.equals("IV")) {
//                        return 4;
//                    } else if (roman.equals("V")) {
//                        return 5;
//                    } else if (roman.equals("VI")) {
//                        return 6;
//                    } else if (roman.equals("VII")) {
//                        return 7;
//                    } else if (roman.equals("VIII")) {
//                        return 8;
//                    } else if (roman.equals("IX")) {
//                        return 9;
//                    } else if (roman.equals("X")) {
//                        return 10;
//                    }
//                    return 0;
//                }
//            }
//
//            for (int i = 1; i <= 10; i++){
//                num1 = i;
//                for (int j = 1; j <= 10; j++){
//                    num2 = j;
//                    if(num1+num2>0){
//                        result = inputString[i] + inputString[j];
//                    }else if(num1 - num2 > 0){
//                        result = inputString[i] - inputString[j];
//                    }else if(num1 / num2 > 0){
//                        result = inputString[i] / inputString[j];
//                    }if (num1 * num2 > 0){
//                        result = inputString[i] * inputString[j];
//                    }
//
//                }return inputString;
//
//            }
//
//        }

        return inputString;
    }
}
