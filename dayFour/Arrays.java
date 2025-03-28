

public class Arrays 
{
    public static void main(String[] args) 
    {
        int bigArr[][] =  new int[3][4];

        for (int i=0; i<3; i++) 
        {
            for (int j=0; j<4; j++) 
            {
                bigArr[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i=0; i<bigArr.length; i++) 
        {
            for (int j=0; j<bigArr.length; j++) {
                System.out.print(bigArr[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[] : bigArr) // enhanced array
        {
            for (int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        

        /* int num[] = {5, 6, 7, 8};
        num[1] = 9;
        int num1[] = new int[5]; // returns all 0

        for(int i=0; i<num.length; i++)
            {
                System.out.println(num[i]);
            } */
    }
}