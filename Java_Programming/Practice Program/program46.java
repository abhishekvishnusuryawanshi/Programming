
import java.util.Scanner;

class NumberX
{
    public void DisplayFactors(int iNO)
    {
        int iCnt = 0;

        for(iCnt = 1 ;iCnt < iNO ; iCnt++)
        {
            if((iNO % iCnt)==0)
            {
                System.out.println(iCnt);
            }
            
        }
    }

}
class program46
{

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        
        System.out.println("Enter Number:");

        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        nobj.DisplayFactors(iValue);

       
    }
}

//Time Complexity : O(N)
// where N>=0+