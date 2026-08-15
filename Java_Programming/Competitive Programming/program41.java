/*
    Accept the number of days a library book is kept and calculate the fine based on the number of overdue days.
*/

import java.util.*;

class program41
{

    public static void FineCalculator(int iNo)
    {
        int FineAmount = 0;

        if(iNo < 0)
        {
            System.out.println("Invaild Input");
            return;
        }

        if(iNo <= 7)
        {
            System.out.println("No Fine return within time");
            
        }
        else if(iNo <= 12)
        {
            FineAmount = (iNo - 7)*5;
            System.out.println("Total fine to be paid: " +FineAmount);
        }
        else
        {
            FineAmount = 25 + (iNo - 12)*10;
            System.out.println("Total fine to be paid: " +FineAmount);
        }
        
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Days you kept Book");
        int daysKept = sobj.nextInt();

        FineCalculator(daysKept);

    }
}
