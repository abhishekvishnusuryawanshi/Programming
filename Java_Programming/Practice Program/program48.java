
import java.util.Scanner;

class NumberX
{
    public void SumFactors(int iNO)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 1 ;iCnt <= (iNo / 2);i++)
        {
            if((iNo % iCnt)==0)
            {
               iSum = iSum + iCnt;
    
            }
            
        }
        System.out.println("Summation of Factor : "+iSum);
    }

}
class program48
{

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        
        System.out.println("Enter Number:");

        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        nobj.SumFactors(iValue);

       
    }
}
//Time Complexity : O(N/2)
// where N>=0+