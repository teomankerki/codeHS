import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the sales tax rate: ");
        double tax = in.nextDouble();

        System.out.println("How many boards do you need? ");
        int x = in.nextInt();

        System.out.println("How many windows do you need? ");
        int y = in.nextInt();

        Construction c = new Construction(8.0, 11.0, tax);

        double total = c.lumberCost(x) + c.windowCost(y);
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + c.grandTotal(total));
    }
}
