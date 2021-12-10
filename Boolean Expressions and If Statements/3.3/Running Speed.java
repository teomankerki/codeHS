import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        if(time<223){
            System.out.println("Are you sure? That’s a new world record!");
        }
        else{
            System.out.println("Right on! Keep running!");
        }
    }
}
