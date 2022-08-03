public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;
    private String shape;

    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }

    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String c, String co, String s)
    {
        candy = c;
        color = co;
        shape = s;
    }

    // Add an overloaded constructor that allows the user
    // to customize the color and shape

    public Pinata(String co, String s)
    {
        candy = "hard candy";
        color = co;
        shape = s;
    }

    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String c)
    {
        candy = c;
        color = "rainbow";
        shape = "donkey";
    }


    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}
