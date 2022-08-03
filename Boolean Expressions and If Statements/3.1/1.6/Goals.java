import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Ask for goal amount
        System.out.println("Enter your goal:");
        int goal = in.nextInt();
        // Ask for actual amount
        System.out.println("Enter your actual amount:");
        int act = in.nextInt();
        // Compare numbers by creating three booleans

        boolean over = (act>goal);
        boolean meet = (goal > act);
        boolean ex = (goal == act);

        // Display results as instructed
        System.out.println("Went over goal? " + over);
        System.out.println("Did not meet goal? " + meet);
        System.out.println("Met goal exactly? " + ex);
    }
}
