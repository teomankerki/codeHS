import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("How much does dinner usually cost?");
        double dinner = input.nextDouble() *3;
        System.out.println("How much is laser tag for one person?");
        double laser = input.nextDouble()*2;

        System.out.println("How much does a triple scoop cost?");
        double ice = input.nextDouble();
        ice += ice/3;

        System.out.println("Dinner: $" + dinner);
        System.out.println("Laser Tag: $" + laser);
        System.out.println("Ice-cream: $" + ice);
        System.out.println("Grand Total: $" + (dinner + laser + ice));

    }
}
