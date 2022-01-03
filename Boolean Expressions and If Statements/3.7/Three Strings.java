import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";
        Scanner in = new Scanner(System.in);

        // Use comments to organize your logic before you start coding
        System.out.println("Enter your password:");
        String a = in.nextLine();
        System.out.println("Enter your company's secret code:");
        String b = in.nextLine();

        if(b.equals(companyCode)){
            System.out.println("Access granted");
        }
        else{
            System.out.println(a + b +" is denied");
        }
    }
}
