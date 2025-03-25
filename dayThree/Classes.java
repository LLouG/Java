

public class Classes 
{
    public static void main(String[] args) 
    {
        Calculator calc = new Calculator();
        int result = calc.add(3, 4);

        System.out.println(result);
    }
}


class Calculator
{
    public int add(int num1, int num2)
    {
        int res = num1 + num2;
        return res;
    }
}