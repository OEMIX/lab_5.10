package com.company;

public class Main {

    public static void main(String[] args) {
        // for //
        for (int a = 500; a <= 650; a = a + 10) {
            System.out.println(a);
        }
        System.out.println();
        // while //
        int b = 500;
        while (b <= 650) {
            System.out.println(b);
            b = b + 10;
        }
        System.out.println();
        // do-while //
        int c = 500;
        do {
            System.out.println(c);
            c = c+10;
        }while (c<=650);
    }
}