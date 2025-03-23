class Hello
{
    public static void main(String a[]) 
    {
        /* byte  b = 127; */
        int c = 257;
        byte k = (byte) c; // performs a modulus operation, resulting in 1
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);
    }
}