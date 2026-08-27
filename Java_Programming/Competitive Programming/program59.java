/*
    Calculate water bill using progressive slabs and apply late payment penalty.
*/

import java.util.*;

class WaterBill
{
    public void CalculateBill(int units, int weeksLate)
    {
        if(units < 0 || weeksLate < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int billAmount = 0;
        int meterCharge = 50;
        int penalty = 0;
        int penaltyPercent = 0;

        if(units <= 100)
        {
            billAmount = units * 5;
        }
        else if(units <= 200)
        {
            billAmount = (100 * 5) + ((units - 100) * 8);
        }
        else if(units <= 500)
        {
            billAmount = (100 * 5) + (100 * 8) + ((units - 200) * 12);
        }
        else
        {
            billAmount = (100 * 5) + (100 * 8) + (300 * 12) + ((units - 500) * 15);
        }

        billAmount = billAmount + meterCharge;

        if(weeksLate > 0)
        {
            penaltyPercent = weeksLate * 2;

            if(penaltyPercent > 10)
            {
                penaltyPercent = 10;
            }

            penalty = (billAmount * penaltyPercent) / 100;
            billAmount = billAmount + penalty;
        }

        System.out.println("Water Units : " + units);
        System.out.println("Meter Charge : " + meterCharge);
        System.out.println("Late Penalty : " + penalty);
        System.out.println("Bill Amount : " + billAmount);
    }
}

class program59
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iUnits = 0;
        int iWeeks = 0;

        System.out.println("Enter Water Units : ");
        iUnits = sobj.nextInt();

        System.out.println("Enter Weeks Late : ");
        iWeeks = sobj.nextInt();

        WaterBill wobj = new WaterBill();
        wobj.CalculateBill(iUnits, iWeeks);
    }
}
