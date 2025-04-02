

public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setName("Loug");
        obj.setAge(32);

        System.out.println(obj.getName() + " is " + obj.getAge() + " years old.");
    }    
}


class Human
{
    private int age;
    String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
