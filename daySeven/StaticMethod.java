

public class StaticMethod 
{
    public static void main(String[] args) 
    {
        Hansol student1 = new Hansol();
        Hansol.name = "Haejoon Goh";
        student1.studentClass = 34;
        student1.height = 1.84;

        Hansol student2 = new Hansol();
        Hansol.name = "Eunyung Baek";
        student2.studentClass = 24;
        student2.height = 1.84;

        Hansol.show(student1);
        Hansol.show(student2);
    }
}

class Hansol
{
    double height;
    int studentClass;
    static String name;

    public static void show(Hansol obj) 
    {
        System.out.println("Student named " + Hansol.name + " from class " + obj.studentClass + " is " + obj.height + " tall.");        
    }
}


