
import java.util.Scanner;

class NumberX
{
    public int SumFactors(int iNO)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 1 ;iCnt <= (iNO / 2);iCnt++)
        {
            if((iNO % iCnt)==0)
            {
               iSum = iSum + iCnt;

            }
            
        }
       return iSum;
    }

}
class program49
{

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;
        
        System.out.println("Enter Number:");

        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        iRet=nobj.SumFactors(iValue);

        System.out.println("Summation of Factor : "+iRet);

    }
}
//Time Complexity : O(N/2)
// where N>=0