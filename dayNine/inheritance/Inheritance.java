import tools.NewAdvCalc;


public class Inheritance {
    public static void main(String[] args) 
    {
        NewAdvCalc obj = new NewAdvCalc();
        int r1 = obj.add(5, 2);
        int r2 = obj.sub(7, 2);
        int r3 = obj.multi(2, 7);
        int r4 = obj.div(10, 2);
        double r5 = obj.power(4, 2);

        System.out.println( r1 + "\n" + 
                            r2 + "\n" + 
                            r3 + "\n" + 
                            r4 + "\n" + 
                            r5);
    }    
}