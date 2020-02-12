package com.test;

import java.io.*;
import java.util.*;

public class CheckScanner
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int t = 0; t < n; t++) {
        	System.out.println("Enter first integer");
            int a = sc.nextInt();
            System.out.println("Enter Second integer");
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}