package com.company;

public class SlashesProblem {
    public static void main(String[] args) {
        String [] slashes = {"/", "-", "\\", "|"};
        String result = "";
        while (true) {
            for (int i = 0; i < slashes.length; i++) {
                result = slashes[i];
                System.out.print(result);
                System.out.println();
            }
        }
    }
}
