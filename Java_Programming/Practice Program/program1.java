///////////////////////////////
//
// program accepts an integer input from the user and checks whether
//  the number is divisible by both 3 and 5.
//
//////////////////////////////

import java.util.Scanner;

class NumberX
{
    public boolean CheckDivisible(int iNo)
    {

        if((iNo % 3 ==0)&&(iNo % 5 ==0))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
class program1
{

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;


        System.out.println("Enter Number:");
        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        bRet= nobj.CheckDivisible(iValue);  

        if(bRet == true)
        {
        System.out.println("Number is Divisible by 3 & 5");
        }
        else
        {
          System.out.println("Number is Divisible NOT by 3 & 5");  
        }

    }
}
