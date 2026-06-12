// write a program to check whether a number is a perfect number or not.

class Logic
{
    void CheckPerfect(int iNum)
    {
         int iSum = 0;

        for(int iCnt = 1; iCnt < iNum; iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNum)
        {
            System.out.println(iNum + " is a Perfect Number");
        }
        else
        {
            System.out.println(iNum + " is Not a Perfect Number");
        }
    }

}
class program18
{
    public static void main(String[] args) 
    {   
        Logic obj = new Logic();
        obj.CheckPerfect(6);       
    }
}
