public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5);

        // Square the number
        // Print it out
        double sq = game.squareNumber();
        System.out.println(sq);

        // Double the number
        // Print it out
        sq = game.doubleNumber();
        System.out.println(sq);

        // Square the number again
        // Print it out
        sq = game.squareNumber();
        System.out.println(sq);

        // Get the number and store the value
        sq = game.getNumber();
        // Print out your stored value
        System.out.println(sq);
        // Print out the result of getNumber
        System.out.println(game.getNumber());
        // Note that getNumber does not change the number's value

    }
}
