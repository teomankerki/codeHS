import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the author's name as 'Last name, First name': ");
        String name = in.nextLine();

        System.out.println("Enter the title of the book: ");
        String book = in.nextLine();

        System.out.println("Enter the publisher of the book: ");
        String publisher = in.nextLine();

        System.out.println("Enter the year the book was published: ");
        String year = in.nextLine();

        System.out.println(name + ". " + book + ".");
        System.out.println(publisher + ", " + year + ".");
    }
}
