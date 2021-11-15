public class Currency
{
    private Double value;

    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }

    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }

    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        Integer a = (int) (value*100)/100;
        return a;
    }

    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        Integer a = (int) (value*100)%100;
        return a;
    }

    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return("$" + this.getDollars() + "." + this.getCents());
    }
}
