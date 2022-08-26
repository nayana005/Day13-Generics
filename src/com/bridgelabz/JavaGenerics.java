package com.bridgelabz;

public class JavaGenerics {

	public static void main(String[] args) {
		System.out.println("Maximum Problem");
		Integer a = 10, b = 20, c = 15;
		findMax(a,b,c);
	}

	public static Integer findMax(Integer a, Integer b , Integer c){
		Integer maximum = a;
		if(b.compareTo(maximum) > 0){
			maximum = b;
		}
		if(c.compareTo(maximum) > 0){
			maximum = c;
		}
		System.out.println("The Maximum Integer from " + a + " "+ " " + b + " " + c + " is: " + maximum);
		return maximum;
	}
}
