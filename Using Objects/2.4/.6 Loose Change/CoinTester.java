public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here

       Coins a = new Coins(3, 2, 1, 4);

       a.bankValue();

       a.addQuarter();
       a.addQuarter();
       a.addPenny();
       a.addPenny();
       a.addPenny();
       a.addDime();
       a.bankCount();
       a.bankValue();

    }
}
