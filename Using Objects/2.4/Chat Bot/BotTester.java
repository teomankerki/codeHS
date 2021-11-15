import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! What is your name?");

        Bot a = new Bot(in.nextLine());
        a.greeting();

        a.help();
        System.out.println("Tell me Bot, which countries use the imperial system?");

        a.imperialCountries();

        System.out.println("Tell me Bot, what was the first computer bug?");
        a.firstBug();

        a.goodbye();
    }
}
