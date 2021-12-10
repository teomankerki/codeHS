import java.util.Scanner;
public class TripleDouble
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many points did you score?");
        int point = in.nextInt();
        System.out.println("How many rebounds did you get?");
        int rebound = in.nextInt();
        System.out.println("How many assists did you have?");
        int assist = in.nextInt();

        boolean poin = (10<=point);
        boolean reboun = (10<=rebound);
        boolean assis = (10<=assist);

        System.out.println("You got 10 or more points: " +poin);
        System.out.println("You got 10 or more rebounds: " +reboun);
        System.out.println("You got 10 or more points: " +assis);


    }
}
