package com.tnsif.activity;


class E1 {
	E1(){}
    E1(int x) {
        System.out.println("E1 : " + x);
    }
}

class F1 extends E1 {
	public F1(int x) {
		super();
		System.out.println("F1 : " + x);
	}
}

class Test_10{
	public static void main(String[] args) {
		F1 obj = new F1(7);
		
	}
}