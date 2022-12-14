package com.driver;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.meth();
        obj2.meth();
    }

    public static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
}