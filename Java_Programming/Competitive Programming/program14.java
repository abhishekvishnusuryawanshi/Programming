// Write a program to to print each digit of a number separately.

class Logic
{
    void PrintDigit(int iNum)
    {
        int iDigit = 0;
                      
        while(iNum > 0)
        {
            iDigit = iNum % 10;
            System.out.println(iDigit);
            iNum = iNum / 10;
        }
    }
}

class program14
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.PrintDigit(9876);
    }
}
