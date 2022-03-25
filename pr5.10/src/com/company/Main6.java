package com.company;

public class Main6 {

    public static void main(String[] args){
        int a,b,c,d;
        for (int z=99;z<=999;z++){
            a=z/100;
            b=z%100;
            for (int x=99;x<=999;x++){
                c=x/100;
                d=x%100;
                if (a+b == c+d){
                    System.out.println(a+""+b+""+c+""+d);
                }
            }
        }
    }
}
