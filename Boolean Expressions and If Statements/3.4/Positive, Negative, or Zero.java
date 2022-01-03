import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if(a>0){
            System.out.println("The number is positive");
        }
        else if(a<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is neither positive nor negative");
        }
    }
}
