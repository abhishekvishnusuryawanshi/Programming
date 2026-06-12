// Write a program to display the grade of a student based on marks.

class Logic
{
    void DisplayGrade(int iMarks)
    {
        if((iMarks > 100) || (iMarks < 0))
        {
            System.out.println("Enter the vaild Input");
        }

        if( iMarks >= 75 )
        {
            System.out.println("Distinction");
        }
        else if(iMarks >=65)
        {
            System.out.println("First class");
        }
        else if(iMarks >= 55)
        {
            System.out.println("Second Class");
        }
        else if(iMarks >=35)
        {
            System.out.println("Pass Class");
        }
        else
        {
            System.out.println("Fail");
        }


    }
}

class program12
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.DisplayGrade(82);
    }
}
