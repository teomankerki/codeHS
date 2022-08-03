import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner in = new Scanner(System.in);
        // Create an Extremes object

        Extremes e = new Extremes();

        // Ask the user to guess the maximum value of an Integer

        System.out.println("What do you think the maximum integer value is? ");
        int guess = in.nextInt();

        // Compute and display what they'd need to multiply by
        // to reach the maximum number
        int b = e.maxQuotient(guess);
        System.out.println("You'd need to multiply your number by " + b+ " to reach the max value!");

        // Ask the user to guess the minimum value of an Integer
        System.out.println("What do you think the minimum integer value is?");
        int guess2 = in.nextInt();
        int a= e.minQuotient(guess2);
        System.out.println("You'd need to multiply your number by " + a+ " to reach the max value!");

        // Compute and display what they'd need to multiply by
        // to reach the minimum number

    }
}
