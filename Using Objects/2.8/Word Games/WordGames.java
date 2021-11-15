public class WordGames
{
    private String word;

    public WordGames(String text)
    {
        word = text;
    }

    public String scramble()
    {
        // switch first half
        // and second half
        String str1 = word.substring(0,(word.length()/2));
        String str2 = word.substring((word.length()/2));
        return(str2 + str1);
    }


    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        String str1 = word.substring(0,insertIdx);

        String str2 = word.substring(insertIdx);
        return(str1 + insertText +str2);
    }


    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int a = word.indexOf(insertChar);

        String str1 = word.substring(0,a);
        String str2 = word.substring(a);
        return(str1 + insertText + str2);

    }


    public String toString()
    {
        // Games[word]
        return("[" + word + "]");
    }


}
