/*
    Accept a purchase amount and membership type, apply the applicable discount and additional premium-member discount, and calculate the final payable amount.
*/

import java.util.*;

class Billing
{
    public float CheckBill(float fAmount, int iValue)
    {
        float fDis = 0;

        if(fAmount <= 0 || (iValue != 1 && iValue != 2))
        {
            System.out.println("Invalid Input");
            return 0;
        }

        if(fAmount > 5000)
        {
            fDis = fAmount * 20.0f / 100.0f;
        }
        else if(fAmount > 2000)
        {
            fDis = fAmount * 10.0f / 100.0f;
        }
        else
        {
            fDis = 0.0f;
        }

        fAmount = fAmount - fDis;

        if(iValue == 2)
        {
            float pDis = fAmount * 5.0f / 100.0f;
            fAmount = fAmount - pDis;
        }

        return fAmount;
    }
}
class program45
{
    public static void main(String A[])
    {
        float fValue1 = 0 ;
        int iValue1 = 0; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the purchase amount :");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter a vaild Number to Select the membership Type 1.Regular and 2.Premium ");
        iValue1 = sobj.nextInt();

        Billing bobj = new Billing();
        
        float fRet = bobj.CheckBill(fValue1,iValue1);

        System.out.println("Billing Amount : "+fRet);

    }
}
