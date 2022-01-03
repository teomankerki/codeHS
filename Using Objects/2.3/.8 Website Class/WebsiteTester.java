public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        Website p = new Website();
        System.out.println(p);

        Website x = new Website("gov", "www");
        System.out.println(x);

        Website c = new Website("gov", "www", 21);
        System.out.println(c);
    }
}
