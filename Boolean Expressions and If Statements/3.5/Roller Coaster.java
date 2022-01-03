import java.util.Scanner;

public class RollerCoaster
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How tall are you?");
        int length = input.nextInt();

        System.out.println("How old are you?");
        int age= input.nextInt();


        if(age>=9 && length>=42){
            System.out.println("Welcome aboard!");
        }
        else{
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}
