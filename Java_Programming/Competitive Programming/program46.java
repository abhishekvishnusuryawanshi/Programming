/*
    Accept parking duration in hours and calculate the total parking fee
    based on the applicable parking charges.
*/

import java.util.*;

class ParkingBill
{
    public int BillGenerate(int Hours)
    {
        int iAmount = 0;

        if(Hours <= 0)
        {
            System.out.println("Invalid Input");
            return 0;
        }

        if(Hours <= 2)
        {
            iAmount = 20;
        }
        else
        {
            iAmount = 20 + (Hours - 2) * 10;
        }

        if(Hours > 10)
        {
            iAmount = iAmount + 50;
        }

        return iAmount;
    }
}

class program46
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Total Duration of Parking in Hours : ");
        int iValue = sobj.nextInt();

        ParkingBill pobj = new ParkingBill();

        int iRet = pobj.BillGenerate(iValue);

        System.out.println("Total Parking Duration : " + iValue);
        System.out.println("Total Parking Fees : " + iRet + " Rupees");
    }
}
