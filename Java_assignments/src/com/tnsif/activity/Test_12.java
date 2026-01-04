package com.tnsif.activity;

class G2 {
    void show() {
        System.out.println("G2");
    }
}

class H1 extends G2{
    void show() {
        System.out.println("H1");
    }
}

public class Test_12 {
    public static void main(String[] args) {
        H1 a = new H1();
        a.show();
    }
}