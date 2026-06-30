import java.util.Scanner;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        boolean bFlag = true;
        int iCnt = 0;

        for(iCnt = 2 ;iCnt <= (iNo / 2);iCnt++)
        {
            if((iNo % iCnt)==0)
            {
               bFlag = false;
               break;

            }
        }
        return bFlag;
    }

}
class program68
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0;
        boolean bRet =false;
        
        System.out.println("Enter Number:");

        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        bRet=nobj.CheckPrime(iValue);

        if(bRet==true)
        {
            System.out.println("It is Prime");
        }
        else
        {
           System.out.println("It is NOT Prime"); 
        }

    }
}
