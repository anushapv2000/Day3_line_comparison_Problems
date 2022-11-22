package com.bridgelabz;

import java.util.Scanner;

public class Linecomparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for line 2 ");
        int x21=sc.nextInt();
        int x22=sc.nextInt();
        int y21=sc.nextInt();
        int y22=sc.nextInt();
        System.out.println("Enter values for line 1 ");
        int x11=sc.nextInt();
        int x12=sc.nextInt();
        int y11=sc.nextInt();
        int y12=sc.nextInt();
        System.out.println("Welcome to Line Comparison Computation Program");
        double len1=Math.sqrt(Math.pow((x12-x11),2)+Math.pow((y12-y11),2));
        double len2=Math.sqrt(Math.pow((x22-x21),2)+Math.pow((y22-y21),2));
        System.out.println("len of line 2 is "+len2 );
        System.out.println("len of line 1 is "+len1 );
        Double dlen1=len1;
        Double dlen2=len2;
        if(dlen1.equals(dlen2))
        {
            System.out.println("Two lines are equal");
        } else if (dlen1.compareTo(dlen2)>0) {
            System.out.println("Line 1 is greater than Line2");
        }
        else {
            System.out.println("Line 2 is greater than line1");
        }

    }
}
