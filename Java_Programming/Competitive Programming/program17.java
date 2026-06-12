// write a program to print number from N down to 1 in reverse order.

class Logic
{
    void PrintReverse(int iNum)
    {
        for(int iCnt = iNum; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }

    }


}
class program17
{
    public static void main(String[] args) 
    {   
        Logic obj = new Logic();
        obj.PrintReverse(10);       
    }
}
