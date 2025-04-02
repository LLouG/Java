

public class Constructors {
    public static void main(String[] args) {
        B obj = new B();
        B ob1 = new B(7);   
    }    
}

class A extends Object { 
    // Every class in java extends Object
    public A() {
        System.out.println("In A");
    }

    public A(int n) {
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        super(5);
        System.out.println("In B");
    }
    
    public B(int n) {
        this();
        System.out.println("In B int");
    }
}