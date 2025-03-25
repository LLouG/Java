

public class Loops 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("Day " + i);
            for(int j=0; j<=9; j++)
            {
                System.out.println("Hour " + (j + 9));
            }
        }
        System.out.println("WEEKEND!");
    }
}