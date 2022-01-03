public class WorkShift
{
    public static void main(String[] args)
    {
        int hour = 20;
        int minute = 42;
        int second = 16;

        hour = hour*60*60;
        minute = minute*60;
        second += hour + minute;

        System.out.println(second);
    }
}
