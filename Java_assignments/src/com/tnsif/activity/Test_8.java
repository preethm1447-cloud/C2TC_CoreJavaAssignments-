package com.tnsif.activity;

class C2 {
    void show(int a) {
    }
}

class D2 extends C2 {
    void show(int a) {
        System.out.println("Value of a : " + a);
    }
}


public class Test_8 {
    public static void main(String[] args) {
        C2 obj = new D2();   
        obj.show(7);
    }
}