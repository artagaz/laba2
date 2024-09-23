package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //1
//        float a = scanner.nextFloat();
//        float b = scanner.nextFloat();
//        float c = scanner.nextFloat();
//
//        System.out.println(triangle(a, b, c));

        //2
//        float x1 = scanner.nextFloat();
//        float y1 = scanner.nextFloat();
//        float x2 = scanner.nextFloat();
//        float y2 = scanner.nextFloat();
//
//        System.out.println(distance(x1, y1, x2, y2));

        //3
    }

    public static boolean triangle(float a, float b, float c)
    {
        return ((a>0) && (b>0) && (c>0) && (a + b > c) && (a + c > b) && (b + c > a));
    }

    public static double distance(float x1, float y1, float x2, float y2)
    {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
}