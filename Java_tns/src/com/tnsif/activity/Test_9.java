package com.tnsif.activity;

class C3 {
    void show() {        
        System.out.println("C3");
    }
}

class D3 extends C3 {
	void show() {
		System.out.println("D3");
	}
}

public class Test_9 {
       public static void main(String[] args) {
		D3 obj = new D3();
		obj.show();
	}
}