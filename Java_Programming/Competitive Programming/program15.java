// Write a program to calculate the power of a number using loops.

class Logic
{
    void CalculatePower(int iBase, int iExpo)
    {
        int iResult = 1;
        
        while(iExpo > 0)
        {
            iResult = iResult * iBase;
            iExpo--;
        }
        System.out.println(+iResult);
    }
}

class program15
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CalculatePower(2 , 5 );
    }
}
