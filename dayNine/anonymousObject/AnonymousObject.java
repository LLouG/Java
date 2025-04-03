package anonymousObject;


public class AnonymousObject {
    public static void main(String[] args) 
    {
        new A().show();  // Anonymous object
    }
}

class A {
    public A()
    {
        System.out.println("object created");
    }

    public void show() 
    {
        System.out.println("In A show()");
    }
}