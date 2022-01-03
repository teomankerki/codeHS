public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater r = new Rater("teoman", 2);
        r.updateReview();
        System.out.println(r);
        r.setRating(4);
        r.updateReview();
        System.out.println(r);
    }
}
