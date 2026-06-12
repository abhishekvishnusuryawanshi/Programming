// Write a program to given year is a leap year or not.

class Logic
{
    void CheckLeapYear(int iYear)
    {
        if((iYear % 4)==0)
        {
            System.out.println("it is Leap Year: "+iYear);
        }
        else
        {
            System.out.println("it is NOT Leap Year: "+iYear);
        }

    }
}

class program11
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(2024);
    }
}
