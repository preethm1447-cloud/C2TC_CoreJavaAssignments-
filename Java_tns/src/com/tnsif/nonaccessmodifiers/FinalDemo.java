package com.tnsif.nonaccessmodifiers;

class FinalDemo {

    final int VAR = 100;

    final void display() {
        System.out.println("show the value of var: " + VAR);
    }
}

class Child {
    void show() {
        FinalDemo fd = new FinalDemo();
        fd.display();
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}


