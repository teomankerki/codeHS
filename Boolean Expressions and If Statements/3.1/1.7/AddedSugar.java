import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Ask the user for the grams of sugar
        Scanner in = new Scanner(System.in);

        System.out.println("How many grams of sugar have you eaten today?");
        int sugar = in.nextInt();

        boolean over = (30>sugar);
        // Use a boolean expression to print if they can eat more sugar
        System.out.println("You can eat more sugar: " + over);
    }
}
