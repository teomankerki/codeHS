public class Website
{
    // Put your code here
    private String domain;
    private String topLevelDomain;
    private int numUsers;


    //Default constructor
    public Website(){

        topLevelDomain = "com";
        domain = "";
        numUsers = 0;
    }

    // Specify website URL
    // Register a new website
    public Website(String domainName, String topDomain){
        topLevelDomain = topDomain;
        domain = domainName;
        numUsers = 0;

    }

    // Specify website URL
    // Register an old website
    public Website(String domainName, String topDomain, int numPeople){
        topLevelDomain = topDomain;
        domain = domainName;
        numUsers = numPeople;
    }





    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";

        return res;
    }
}
