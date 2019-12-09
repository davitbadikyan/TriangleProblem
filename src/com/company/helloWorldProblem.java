package com.company;

public class helloWorldProblem {
    public static void main(String[] args) {
        String str = "hello world";
        String result = "";
        while (true) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result = str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
                    System.out.print(result);
                    System.out.println();
                }
            }
            for (int j = str.length() - 2; j >= 0; j--) {
                if (str.charAt(j) != ' ') {
                    result = str.substring(0, j) + str.substring(j, j + 1).toUpperCase() + str.substring(j + 1);
                    System.out.print(result);
                    System.out.println();
                }
            }
        }
    }
}
