package com.tnsif.activity;

class A2 {
    int x = 10;
}

class B2 extends A2 {
    int x = 20;
}

class Test_4 {
    public static void main(String[] args) {
		B2 b = new B2();
		System.out.println(b.x);
	}
}

