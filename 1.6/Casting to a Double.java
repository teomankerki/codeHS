import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        System.out.println("First Int: " + int1);
        System.out.println("Second Int: " + int2);
        double division = (double) int1/int2;
        System.out.println(division);
    }
}
