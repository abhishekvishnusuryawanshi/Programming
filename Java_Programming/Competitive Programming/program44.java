/*
    Electricity Bill: Accept the number of units consumed and calculate the electricity bill based on the applicable unit-wise rates.
*/
import java.util.*;

class program44
{

    public static int ElectricityBill(int iUnit)
    {
        int Amount = 0;

        if(iUnit < 0)
        {
            System.out.println("Enter Vaild Input");
            return 0;
        }

        if(iUnit <= 100)
        {
            Amount = iUnit * 5;
        }
        else if(iUnit <= 200)
        {
            Amount = (100 * 5) + ((iUnit - 100) * 7);
        }
        else
        {
            Amount = (100 * 5) + (100 * 7) + ((iUnit - 200) * 10);
        }

        return Amount;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Unit Consumed :");
        int iValue = sobj.nextInt();

        int iRet = ElectricityBill(iValue);

        System.out.println("The Total uint Counsumed : "+iValue);
        System.out.println("The Eletricity Bill is : "+iRet);


    }
}
