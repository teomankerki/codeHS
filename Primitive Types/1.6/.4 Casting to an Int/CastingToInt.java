import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        // Start here!

        System.out.println("Enter a double:");
        Scanner input = new Scanner(System.in);
        double myDouble = input.nextDouble();
        System.out.println(myDouble);

        int a = (int) myDouble;
        System.out.println(a);

        myDouble += 0.5;
        System.out.println(myDouble);
        int b = (int) myDouble;
        System.out.println(b);
    }
}
