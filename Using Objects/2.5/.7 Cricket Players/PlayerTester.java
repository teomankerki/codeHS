public class PlayerTester
{
    public static void main(String[] args) {

       //Start here
       CricketPlayer t = new CricketPlayer("Teoman");
       CricketPlayer k = new CricketPlayer("Karl", "Marx");

       t.addMatch(10,10);
       t.addMatch(10,10);
       t.addMatch(10,10);
       t.addMatch(10,10);

       k.addMatch(10,10);
       k.addMatch(10,10);
       k.addMatch(10,10);
       k.addMatch(10,10);


       System.out.println("Teoman's Stats:");
       t.printRunsScored();
       t.printBallsBowled();
       System.out.println(t);

       System.out.println("");

       System.out.println("Karl's Stats:");
       k.printRunsScored();
       k.printBallsBowled();
       System.out.println(k);
    }
}
