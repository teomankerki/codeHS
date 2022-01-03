import java.util.Scanner;

public class FindMedian
{
    public static void main(String[] args)
    {
        // Ask the user for three ints and
        // print out the median.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a = in.nextInt();
        System.out.println("Enter the second integer:");
        int b = in.nextInt();
        System.out.println("Enter the third integer:");
        int c = in.nextInt();

        int big = 0;
        int small = 0;
        int med = 0;

        if(a>b){
            big = a;
            small = b;
        }
        else if (b>a){
            big = b;
            small = a;
        }
        else{
            big = a;
            small= a;
            med = a;
        }

        if(c>big){
            med = big;
        }
        else if(c<small){
            med = small;
        }
        else{
            med = c;
        }

        System.out.println("The median is " + med);
    }
}
