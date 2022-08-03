public class MicrowaveCooking
{
    public static void main(String[] args)
    {

        int num = (int) ((Math.random()*150)+90);
       // Generate a random number of seconds
        System.out.println("Microwaving for " +num+" seconds");
       // Print the number of seconds
       if(num<=120){
           System.out.println("Rolls will be the right temperature!");
       }
       else{
           System.out.println("Rolls will be boiling hot!");
       }
       // Use two if statements to print the temperature
    }
}
