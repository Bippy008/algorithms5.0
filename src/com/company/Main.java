package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(factor(2));
        System.out.println(factor(3));
        System.out.println(factor(5));
        System.out.println(pow(2, 3));
        System.out.println(pow(3, 3));
        System.out.println(pow(2, 10));
    }

    public static int factor(int num) {
        if (num == 1 || num <= 0) {
            return 1;
        }
        return num * factor(num-1);
    }

    public static int pow(int num, int powInt) {
        if (powInt == 0) {
            return 1;
        } else {
            return num * pow(num, powInt-1);
        }
    }
}
