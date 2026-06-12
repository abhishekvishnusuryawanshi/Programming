// write a program to count how many even and odd number are present between 1 and N.

class Logic
{
    void CountEvenOddRange(int iNum)
    {
        int EvenCount = 0;
        int OddCount = 0;
        int iCnt = 0;

        for(iCnt= 0 ; iCnt < iNum ; iCnt++)
        if((iCnt % 2)==0)
        {
            EvenCount++;
        }
        else 
        {
            OddCount++;
        }
        System.out.println("Even numbers count : " + EvenCount);
        System.out.println("Odd numbers count  : " + OddCount);
        
    }

}
class program22
{
    public static void main(String[] args) 
    {   
        Logic obj = new Logic();
        obj.CountEvenOddRange(50);     
    }
}
