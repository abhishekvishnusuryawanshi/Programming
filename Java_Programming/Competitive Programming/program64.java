/*
    Suggest Recharge Plan According to the the User requried Usage input
*/
import java.util.Scanner;

class CallBill
{
    public void Calculate(int iMinutes)
    {
        if(iMinutes < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Amount = 0;

        if(iMinutes <= 5)
        {
            Amount = 0;
        }
        else if(iMinutes <= 15)
        {
            Amount = (iMinutes - 5) * 1;
        }
        else
        {
            Amount = (10 * 1) + ((iMinutes - 15) * 2);
        }

        System.out.println("Call Duration: " + iMinutes + " minutes");
        System.out.println("Total Call Charge: ₹" + Amount);
    }
}

class program64
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Call Duration in Minutes");
        int iMinutes = sobj.nextInt();

        CallBill cobj = new CallBill();
        cobj.Calculate(iMinutes);
    }
}

