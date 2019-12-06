package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your Type A triangle length: ");
        int typeATriangleLength = scanner.nextInt();
        System.out.print("Input your Type B triangle length: ");
        int typeBTriangleLength = scanner.nextInt();
        System.out.print("Input your Type C triangle length: ");
        int typeCTriangleLength = scanner.nextInt();
        System.out.print("Input your Type D triangle length: ");
        int typeDTriangleLength = scanner.nextInt();
        System.out.print("Input your Type E triangle length: ");
        int typeETriangleLength = scanner.nextInt();
        System.out.print("Input your Type F triangle length: ");
        int typeFTriangleLength = scanner.nextInt();
        System.out.print("Input your Type G triangle length: ");
        int typeGTriangleLength = scanner.nextInt();
        System.out.print("Input your Type H triangle length: ");
        int typeHTriangleLength = scanner.nextInt();

        typeATriangle(typeATriangleLength);
        typeBTriangle(typeBTriangleLength);
        typeCTriangle(typeCTriangleLength);
        typeDTriangle(typeDTriangleLength);
        typeETriangle(typeETriangleLength);
        typeFTriangle(typeFTriangleLength);
        typeGTriangle(typeGTriangleLength);
        typeHTriangle(typeHTriangleLength);

    }

    private static void typeATriangle(int typeATriangleLength) {
        // A triangle
        for (int j = 0; j <= typeATriangleLength; j++) {
            for (int i = 0; i <= typeATriangleLength - j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // A empty triangle
        for (int j = 0; j <= typeATriangleLength; j++) {
            for (int i = 0; i <= typeATriangleLength - j; i++) {
                if (j == 0) {
                    System.out.print("* ");
                } else if (i == 0 || i == typeATriangleLength - j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void typeBTriangle(int typeBTriangleLength) {
        if(typeBTriangleLength%2 == 1){
            typeBTriangleLength+=1;
        }
        // B triangle
        for (int j = 0; j <= typeBTriangleLength / 2; j++) {
            for (int i = 0; i <= typeBTriangleLength; i++) {
                if (i >= (typeBTriangleLength / 2) - j && i <= (typeBTriangleLength / 2) + j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // B empty triangle
        for (int j = 0; j <= typeBTriangleLength / 2; j++) {
            for (int i = 0; i <= typeBTriangleLength; i++) {
                if (i == (typeBTriangleLength / 2) - j || i == (typeBTriangleLength / 2) + j) {
                    System.out.print("* ");
                } else if (j == typeBTriangleLength / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void typeCTriangle(int typeCTriangleLength) {
        // C triangle
        for (int j = 0; j <= typeCTriangleLength; j++) {
            for (int i = 0; i <= typeCTriangleLength; i++) {
                if (i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // C empty triangle
        for (int j = 0; j <= typeCTriangleLength; j++) {
            for (int i = 0; i <= typeCTriangleLength; i++) {
                if (i == j || i == typeCTriangleLength || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void typeDTriangle(int typeDTriangleLength) {
        // D triangle
        for (int j = 0; j <= typeDTriangleLength; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // D empty triangle
        for (int j = 0; j <= typeDTriangleLength; j++) {
            for (int i = 0; i <= j; i++) {
                if (j == typeDTriangleLength || i == j || i == 0) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void typeETriangle(int typeETriangleLength) {
        if(typeETriangleLength%2 == 1){
            typeETriangleLength+=1;
        }
        // E triangle
        for (int j = 0; j <= typeETriangleLength / 2; j++) {
            for (int i = 0; i <= typeETriangleLength; i++) {
                if (i >= j && i <= typeETriangleLength - j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // E empty triangle
        for (int j = 0; j <= typeETriangleLength / 2; j++) {
            for (int i = 0; i <= typeETriangleLength; i++) {
                if (i == j || i == typeETriangleLength - j) {
                    System.out.print("* ");
                } else if (j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void typeFTriangle(int typeFTriangleLength) {
        // F triangle
        for (int j = 0; j <= typeFTriangleLength; j++) {
            for (int i = 0; i <= typeFTriangleLength; i++) {
                if (i <= typeFTriangleLength - j) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // F empty triangle
        for (int j = 0; j <= typeFTriangleLength; j++) {
            for (int i = 0; i <= typeFTriangleLength; i++) {
                if (i == typeFTriangleLength - j || i == typeFTriangleLength || j == typeFTriangleLength) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void typeGTriangle(int typeGTriangleLength) {
        if(typeGTriangleLength%2 == 1){
            typeGTriangleLength+=1;
        }
        // G triangle
        for (int j = 0; j <= typeGTriangleLength; j++) {
            for (int i = 0; i <= typeGTriangleLength / 2; i++) {
                if (j >= (typeGTriangleLength / 2) - i && j <= (typeGTriangleLength / 2) + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // G empty triangle
        for (int j = 0; j <= typeGTriangleLength; j++) {
            for (int i = 0; i <= typeGTriangleLength / 2; i++) {
                if (j == (typeGTriangleLength / 2) - i || j == (typeGTriangleLength / 2) + i || i == typeGTriangleLength / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void typeHTriangle(int typeHTriangleLength) {
        if(typeHTriangleLength%2 == 1){
            typeHTriangleLength+=1;
        }
        // H triangle
        for (int j = 0; j <= typeHTriangleLength; j++) {
            for (int i = 0; i <= typeHTriangleLength / 2; i++) {
                if (j >= i && j <= typeHTriangleLength - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // H empty triangle
        for (int j = 0; j <= typeHTriangleLength; j++) {
            for (int i = 0; i <= typeHTriangleLength / 2; i++) {
                if (j == i || j == typeHTriangleLength - i || i == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



