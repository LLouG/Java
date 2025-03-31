

public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.name = "Loug";
        obj.setAge(30);

        System.out.println(obj.name + " is " + obj.getAge() + " years old.");
    }    
}


class Human
{
    private int age = 32;
    String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }
}
