public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver

    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }

    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
        double acc = accel;
        double answer = Math.sqrt(2*distance/acc);
        answer = answer *100;
        return ((Math.round(answer))/100.0);
    }

    public String toString()
    {
        return "Racer " + name;
    }
}
