package com.java8;

@FunctionalInterface
interface sayable {
	void say(String msg);
}

public class FunctionalInterfaceEx1 implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceEx1 fie = new FunctionalInterfaceEx1();
		fie.say("Hello there");
	}
}