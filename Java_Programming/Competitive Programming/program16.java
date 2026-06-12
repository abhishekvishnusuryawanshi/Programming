// Write a program to find the sum of all even number upto N.

class Logic
{
    void SumEvenNumber(int iNum)
    {
        int iSumEven = 0;
        for(int iCnt = 0 ; iCnt <= iNum ;iCnt++)
        if((iCnt % 2)== 0)
        {
            iSumEven = iSumEven + iCnt;
        }
        System.out.println("Sum of Even Number: "+iSumEven);
    }
    
}

class program16
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.SumEvenNumber(10);      
    }
}
