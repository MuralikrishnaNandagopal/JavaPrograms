package com.java8;


@FunctionalInterface
interface SquareRoot {
abstract double findSquareRoot(int n);
}


public class FunctionalInterfaceEx2 implements SquareRoot 
{
@Override
public double findSquareRoot(int n) {
return Math.sqrt(n);
}

public static void main(String[] args) {
	FunctionalInterfaceEx2 fiex = new FunctionalInterfaceEx2();
	System.out.println(fiex.findSquareRoot(9));
}
}