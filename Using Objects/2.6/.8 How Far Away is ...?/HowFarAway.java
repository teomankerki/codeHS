import java.util.Scanner;

public class HowFarAway
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the latitude of the starting location:");
        double sL = in.nextDouble();

        System.out.println("Enter the longitude of the starting location:");
        double sK = in.nextDouble();

        System.out.println("Enter the latitude of the ending location:");
        double eL = in.nextDouble();

        System.out.println("Enter the longitude of the ending location:");
        double eK = in.nextDouble();

        GeoLocation a = new GeoLocation(sL, sK);
        GeoLocation b = new GeoLocation(eL, eK);


        System.out.println("The distance is " + a.distanceFrom(b)+ " miles.");
    }
}
