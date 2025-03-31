public class Demo 
{
    public static void main(String[] args) 
    {
        try {
            
            Class.forName("Mobile");
        } catch (Exception e) {
            // System.out.println("some error");
        }

        /* Mobile obj1 = new Mobile();
        obj1.brand = "Xiaomi";
        obj1.price = 999;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile(); */
        
        /* StringBuffer sb = new StringBuffer("Eunyung");
        StringBuilder sbu = new StringBuilder("Haejoon"); */

    }
}


class Mobile 
{
    String brand;
    int price;
    static String name;

    static
    {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile()
    {
        brand = "";
        price = 200;
        name = "Phone";
        System.out.println("in constructor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}