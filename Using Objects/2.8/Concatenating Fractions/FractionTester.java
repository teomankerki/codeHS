import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);

        // Ask for input
        System.out.println("Enter the numerator:");
        int a = input.nextInt();

        System.out.println("Enter the denominator:");
        int b = input.nextInt();
        // Create a new Fraction with the user's input
        Fraction f = new Fraction(a,b);
        Fraction f2 = new Fraction(1,2);
        // Add the fractions
        int sum1 = (f.getDenominator()*1 + f.getNumerator()*2);
        int sum2 = (b*2);

        // Make use of the getDenominator and getNumerator methods

        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println(f2 + " + " + f + " = " + sum1 + "/" +sum2);

    }
}
