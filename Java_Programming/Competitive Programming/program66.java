/*
    Count booked seats, find the row with maximum bookings and check whether any row is completely full.
*/
import java.util.Scanner;

class Cinema
{
    public void Calculate(int Arr[][], int R, int C)
    {
        int TotalBooked = 0;
        int MaxBooking = 0;
        int MaxRow = 0;
        boolean bFull = false;

        for(int i = 0; i < R; i++)
        {
            int RowBooking = 0;

            for(int j = 0; j < C; j++)
            {
                if(Arr[i][j] == 1)
                {
                    TotalBooked++;
                    RowBooking++;
                }
            }

            if(RowBooking > MaxBooking)
            {
                MaxBooking = RowBooking;
                MaxRow = i;
            }

            if(RowBooking == C)
            {
                bFull = true;
            }
        }

        System.out.println("Total Booked Seats: " + TotalBooked);
        System.out.println("Row With Maximum Bookings: Row " + (MaxRow + 1));

        if(bFull == true)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }
    }
}

class program66
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Rows");
        int iR = sobj.nextInt();

        System.out.println("Enter Number of Columns");
        int iC = sobj.nextInt();

        if(iR <= 0 || iC <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[iR][iC];

        System.out.println("Enter Seat Status");

        for(int i = 0; i < iR; i++)
        {
            for(int j = 0; j < iC; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] != 0 && Arr[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        Cinema cobj = new Cinema();
        cobj.Calculate(Arr, iR, iC);
    }
}
