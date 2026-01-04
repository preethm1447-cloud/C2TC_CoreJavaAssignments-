package com.tnsif.activity;

class Person {
	String name;
	int age;
	void greet() {
		System.out.println("Suiii");
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	int rollno;

	@Override
	public String toString() {
		return "Student [rollno = " + rollno + ", name = " + name + ", age = " + age + "]";
	}

	Student(String name, int age, int rollno) {
		super(name, age);
		this.rollno = rollno;
	}
	
	@Override
	void greet() {
		System.out.println("I'm pursuing B.Tech IT");
	}
	
}

public class Test_6 {
    public static void main(String[] args) {
      Student p = new Student("Navi",21,7);   
      p.greet();
      System.out.println(p.toString());
    }
}
