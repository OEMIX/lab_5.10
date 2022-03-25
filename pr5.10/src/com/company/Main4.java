package com.company;

public class Main4 {

    public static void main(String[] args){
        int n = 1;
        int k = 1;

        for (int f = 1;f<=10;f++,k++,n=n*k){
            System.out.println(f+"! = "+n);
        }
        System.out.println();
        //While//
        int a,b,c;
        a = 0;
        b = 0;
        c = 1;
        while (a<=9){
            a++;
            b++;
            c=c*b;
            System.out.println(a+"!= "+c);
        }
    }
}
