

public class ClassStudent 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.name = "Haejoon Goh";
        s1.height = 1.84;
        s1.classroom = 34;

        Student s2 = new Student();
        s2.name = "Eunyung Baek";
        s2.height = 1.84;
        s1.classroom = 24;

        Student s3 = new Student();
        s3.name = "Marie Kim";
        s3.height = 1.54;
        s3.classroom = 32;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // https://youtu.be/4XTsAAHW_Tc?t=16561

        for(Student stud : students) // enhanced for loop
        {
            System.out.println(stud.name + ": " + stud.height);
        }

        /* for (int i=0; i<students.length; i++) 
        {
            System.out.println(students[i].name);
        } */
    }
}

class Student
{
    String name;
    double height;
    int classroom;
}
