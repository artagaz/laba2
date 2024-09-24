package org.example;

import java.util.Scanner;
import java.util.stream.IntStream;

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

        //3+4
//        double a = scanner.nextDouble();
//        int n = scanner.nextInt();
//
//        System.out.println(powerLoop(a, n));
//        System.out.println(power(a, n));

        //5
        int n = scanner.nextInt();
        int[] lastThree = {0,0,1};

        System.out.println(tribonacci(n, lastThree));
    }

    public static boolean triangle(float a, float b, float c)
    {
        return ((a>0) && (b>0) && (c>0) && (a + b > c) && (a + c > b) && (b + c > a));
    }

    public static double distance(float x1, float y1, float x2, float y2)
    {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }

    public static double powerLoop(double a, int n)
    {
        if (a>0 && n>=0) {
            double result = 1.0;

            for (int i = n; i > 0; i--) {
                result *= a;
            }

            return result;
        }else System.out.println("Wrong input");
        return -1;
    }

    public static double power(double a, int n)
    {
        if (a<=0 || n<0) return -1;
        if(n==0) return 1;
        else return a*power(a, n-1);
    }

    public static int tribonacci(int n, int[] lastThree)
    {
        if (n<0) return -1;
        else if(n==1||n==0) return 0;
        else if(n>2)
        {
            int sum = IntStream.of(lastThree).sum();
            lastThree[0] = lastThree[1];lastThree[1] = lastThree[2]; lastThree[2] = sum;
            tribonacci(n-1, lastThree);
        }
        return lastThree[2];
    }
}