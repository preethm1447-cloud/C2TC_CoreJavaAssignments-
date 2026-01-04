package com.tnsif.activity;


class E2 {
	int x = 5;
}

class F2 extends E2 {
	int x = 15; 
	void print() {
       System.out.println(x);   //  change this
   }
}

class Test_11{
	public static void main(String[] args) {
		   F2 obj =new F2();
		   obj.print();
	   }
}