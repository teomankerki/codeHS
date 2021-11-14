public class FallingBodies
{
    public static void main(String[] args)
    {
        final double g = 9.8;
        int t = 23;


        System.out.println("Height: " + g*t*t*0.5);
        System.out.println("Velocity: " + g*t);
    }
}
