public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles

        // Generate a random acceleration for each car
        double acc1 = Math.random();
        double acc2 = Math.random();

        // Create two Racecar objects
        Racecar a = new Racecar(acc1, "Bob");
        Racecar b = new Racecar(acc2, "Marley");
        // Compute the finishing times for both cars
        double x = a.computeTime(distance);
        double y = b.computeTime(distance);
        // Print times of each car
        System.out.println(a + " finished in " + x + " seconds");
        System.out.println(b + " finished in " + y + " seconds");
    }
}
