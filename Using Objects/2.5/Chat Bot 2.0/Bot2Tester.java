import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       // Start Here!
        System.out.println("Hello! What is your name?");
       Scanner in = new Scanner(System.in);
       String name = in.nextLine();
       Bot2 c = new Bot2(name);
       c.greeting();

       System.out.println("");
       System.out.println("What is your favorite animal?");
       String ani = in.nextLine();
       c.favoriteAnimal(ani);

       System.out.println("If you could visit any place, where would you go? ");
       String p = in.nextLine();
       c.destination(p);
       System.out.println("");

       System.out.println("What is your favorite number? ");
       int x = in.nextInt();
       c.favoriteNumber(x);
       System.out.println("");

       c.goodbye();
    }
}
