import java.util.Scanner;



public class CalculatorTester

{

    public static void main(String[] args)

    {

        Scanner scanner = new Scanner(System.in);


        double h = scanner.nextDouble();

        double i = scanner.nextDouble();

        Calculator add = new Calculator();

        System.out.println(h + " + "+ i + " = "+ add.sum(h,i));

        System.out.println(h + " - "+ i + " = "+ add.subtract(h,i));

        System.out.println(h + " * "+ i + " = "+ add.multiply(h,i));

        System.out.println(h + " / "+ i + " = "+ add.divide(h,i));

    }

}
