package p1;

public class Main
{

    public static void main(String[] args)
    {
        int a = 4;
        int b = 7;
        int c = -2;

        System.out.println("The biggest number is " + biggest(a, b, c));

    }

    private static int biggest (int num1, int num2, int num3)
    {
        return biggest(biggest(num1, num2), num3);
    }

    static int biggest (int num1, int num2)
    {
        return (num1 > num2) ? num1 : num2;
    }
}
