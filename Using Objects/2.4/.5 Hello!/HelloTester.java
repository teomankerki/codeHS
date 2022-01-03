import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        Hello name = new Hello(input.nextLine());

        name.spanish();
        name.english();
        name.german();
    }
}
