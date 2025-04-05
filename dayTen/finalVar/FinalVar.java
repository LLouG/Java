package finalVar;


// final -> variable, method, class

public class FinalVar {
    public static void main(String[] args) 
    {
        Author author = new Author();
        author.show();
    }
}

class Author {
    public final void show()
    {
        System.out.println("By Loug");
    }
}