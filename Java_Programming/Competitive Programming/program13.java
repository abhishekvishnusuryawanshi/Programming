// Write a program to to check whether a number is divisible by 5 and 11 or not.

class Logic
{
    void CheckDivisible(int iNum)
    {
        if ((iNum % 5)==0 && ((iNum % 11)== 0))
        {
            System.out.println("The Number is Divisible By 5 & 11");
        }
        else
        {
            System.out.println("The Number is NOT Divisible by 5 & 11");
        }
       
    }
}

class program13
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckDivisible(55);
    }
}
