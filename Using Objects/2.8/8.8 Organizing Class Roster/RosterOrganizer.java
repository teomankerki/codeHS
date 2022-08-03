public class RosterOrganizer
{
    private String student;

    public RosterOrganizer(String studentName)
    {
        student = studentName;
    }

    // Returns the word
    public String getStudent()
    {
        return student;
    }

    // Returns true if student comes
    // before otherStudent.
    // Returns false otherwise.
    public boolean placeBefore(String otherStudent)
    {
        boolean test = false;
        int a = student.compareTo(otherStudent);
        if (a<0){
            test = true;
        }
        return test;
    }


    // Returns true if student comes
    // after otherStudent.
    // Returns false otherwise.
    public boolean placeAfter(String otherStudent)
    {
    boolean test = false;
        int a = student.compareTo(otherStudent);
        if (a>0){
            test = true;
        }
        return test;
    }


    // Returns true if student is equal to otherStudent.
    // Returns false otherwise.
    public boolean isEqual(String otherStudent)
    {
        boolean test = false;
        int a = student.compareTo(otherStudent);
        if (a==0){
            test = true;
        }
        return test;
    }


}
