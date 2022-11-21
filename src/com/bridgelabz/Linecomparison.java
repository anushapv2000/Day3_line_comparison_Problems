package com.bridgelabz;

import java.util.Scanner;

public class Linecomparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        System.out.println("Welcome to Line Comparison Computation Program");
        double len=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("length of line="+len);
    }
}
