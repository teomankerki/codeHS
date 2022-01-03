import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask user for month of year as an integer
        System.out.println("Enter a month as an integer");
        int a = input.nextInt();
        // Use if/else if/else statement to determine if it is spawning season

        if(a>=3 && a<=6){
            System.out.println("Spring spawning season");
        }
        else if(a>=9 && a<= 11){
            System.out.println("Fall spawning season");
        }
        else{
            System.out.println("Not spawning season");
        }
    }
}
