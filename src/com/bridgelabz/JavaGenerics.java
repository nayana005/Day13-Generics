package com.bridgelabz;

public class JavaGenerics<T extends Comparable<T>> {
    T a, b, c;

    public JavaGenerics(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Problem");
        Integer i1 = 10, i2 = 20, i3 = 15;
        Float f1 = 100.30f, f2 = 230.34f, f3 = 173.945f;
        String s1 = "APPLE", s2 = "PEACH", s3 = "BANANA";
        findMax(i1, i2, i3);
        findMax(f1, f2, f3);
        findMax(s1, s2, s3);
    }

    public static <E extends Comparable<E>> void findMax(E a, E b, E c) {
        E maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.println("The Maximum String from " + a + " " + b + " " + c + " is: " + maximum);
    }
}

