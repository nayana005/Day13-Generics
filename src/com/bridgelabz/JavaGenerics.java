package com.bridgelabz;

public class JavaGenerics {

	public static void main(String[] args) {
		System.out.println("Maximum Problem");
		Integer i1 = 10, i2 = 20, i3 = 15;
		Float f1 = 100.30f, f2 = 230.34f, f3 = 173.945f ;
		findMax(i1,i2,i3);
		findMax(f1,f2,f3);
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

	public static Float findMax(Float a, Float b, Float c){
		Float maximum = a;
		if(b.compareTo(maximum) > 0){
			maximum = b;
		}
		if(c.compareTo(maximum) > 0){
			maximum = c;
		}
		System.out.println("The Maximum Float Number from " + a + " "+ " " + b + " " + c + " is: " + maximum);
		return maximum;
	}
}
