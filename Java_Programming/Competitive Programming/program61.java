/*
    Calculate the hotel bill based on the number of days stayed and apply a 5% discount for stays above 7 days.
*/
import java.util.Scanner;

class HotelBill
{
    public void Bill(int iDay)
    {
        if(iDay <= 0)
        {
            System.out.println("Invaild Input");
            return;
        }

        int BillAmt = 0;
        int FinalAmt = 0;
        int DiscountAmt = 0;
        BillAmt = 3000 * iDay;
    

        if(iDay > 7)
        {
            DiscountAmt = (BillAmt * 5)/100;
        }

        FinalAmt = BillAmt - DiscountAmt;
        

        System.out.println("Total Stay Duration: "+iDay);
        System.out.println("Final Bill Amount: "+FinalAmt);
    }
}

class program61
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Days Stayed");
        int iStay = sobj.nextInt();

        HotelBill hobj = new HotelBill();

        hobj.Bill(iStay);

    }
}
