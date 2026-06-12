// Write a program to Find the sum of even and odd digits separtely in a nummber

class Logic
{
    void SumEvenOddDigits(int iNum)
    {
        int iDigit= 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while(iNum > 0)
        {
            iDigit = iNum % 10;

            if((iDigit % 2)==0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }
                iNum = iNum / 10;
        }
        
        System.out.println("Sum of Even Digits: " + iEvenSum);
        System.out.println("Sum of Odd Digits: " + iOddSum);
  
    }
   
}

class program9
{
    public static void main(String A []) 
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(123456);
        
    } 
}
