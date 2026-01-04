package com.tnsif.activity;

class A3 {
    void display() {
        System.out.println("A display");
    }
}

class B3 extends A3 {
	@Override
	void display() {
        System.out.println("B display");
	}
//	void greeting() {
//		System.out.println("Suiii");
//	}
}

class Test_5 {
	public static void main(String[] args ) {
		A3 obj = new B3();
        obj.display();  
    }
}
