

public class Poly {
    public static void main(String[] args) 
    {
        Vehicle obj = new Vehicle();
        obj.show();

        obj = new Motorcycle();
        obj.show();
    }
}


class Vehicle {
    public void show() 
    {
        System.out.println("In Vehicle show()");
    }
}

class Motorcycle extends Vehicle {
    public void show()
    {
        System.out.println("In Laptop show()");
    }
}

class Car {
    public void show()
    {
        System.out.println("In Car show()");
        // obj = new Car() -> obj.show() -> ERROR cannot convert from Car to Vehicle
    }
}