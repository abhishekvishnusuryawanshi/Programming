// Write a program to check whether a number is positive , negative or zero.

class Logic
{
    void CheckSign(int iNum)
    {
        if(iNum > 0)
        {
            System.out.println("Positive Number");
        }
        else if(iNum < 0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Zero");
        }  
    }
}

class program10
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckSign(-80);
    }
}
