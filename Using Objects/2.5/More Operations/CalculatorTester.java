import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double x = in.nextDouble();
        double y = in.nextDouble();
        Calculator c = new Calculator();

        c.sum(x,y);
        c.subtract(x,y);
        c.multiply(x,y);
        c.divide(x,y);
        //To get started, create a new Calculator object
    }
}
