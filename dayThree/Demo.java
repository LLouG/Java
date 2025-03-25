public class Demo 


{
    public static void main(String[] args) 
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);
    }
}


class Computer
{
    public void playMusic()
    {
        System.out.println("Playing music...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        return "Nothing";
    }
}