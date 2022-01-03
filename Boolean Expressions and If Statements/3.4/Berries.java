import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the initial of the berry:");
        String a = in.nextLine();

        char b = a.charAt(0);

        if(b == 'E'){
            System.out.println("You ordered Elderberry");
        }
        else if(b == 'G'){
            System.out.println("You ordered Gooseberry");
        }
        else if(b =='L'){
            System.out.println("You ordered Lingonberry");
        }
        else{
            System.out.println("Berry not recognized");
        }

        // Remember the Scanner object will take whole strings
        // Extract the first character using charAt
        // Remember that characters can be compared using ==

        // Use comments to list the different
        // branches you will need before you write the code
    }
}
