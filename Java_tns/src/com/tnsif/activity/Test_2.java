package com.tnsif.activity;
class A1 {
    A1() {
        System.out.println("A Constructor");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("B Constructor");
    }
}

public class Test_2 {
    public static void main(String[] args) {
        B1 obj = new B1();  
    }
}

