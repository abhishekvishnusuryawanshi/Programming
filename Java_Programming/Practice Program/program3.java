//////////////////////////////////////////////////////////////
//
// This program accepts a number from the user and
// checks whether it is a Perfect Number or not.
// A Perfect Number is equal to the sum of its
// proper factors.
//
// Example:
// 6  = 1 + 2 + 3
// 28 = 1 + 2 + 4 + 7 + 14
//
//////////////////////////////////////////////////////////////

import java.util.Scanner;

class NumberX
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        bRet = nobj.CheckPerfect(iValue);
        
        if(bRet == true)
        {
            System.out.println("It is perfect");
        }
        else
        {
            System.out.println("It is not perfect");
        }
    }
}

// Time Complexity : O(N/2)
// Where N >= 0
