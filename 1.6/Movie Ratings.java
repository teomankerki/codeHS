import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
       System.out.println("Enter movie rating (as a decimal)");
       Scanner input = new Scanner(System.in);
       double score = input.nextDouble();
       score += 0.5;

       int rounded = (int) score;
       System.out.println("Rating rounded: " + rounded);
    }
}
