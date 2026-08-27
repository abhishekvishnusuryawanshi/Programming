/*
    Book cinema seats, calculate row-wise pricing, apply group discount, and display remaining seats.
*/

import java.util.*;

class Cinema
{
    public void BookSeats(int rows, int cols, String bookedSeatList,
                          String requestedSeatList)
    {
        if(rows <= 0 || cols <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        String[] booked = bookedSeatList.split(",");
        String[] requested = requestedSeatList.split(",");

        for(int i = 0; i < requested.length; i++)
        {
            String[] seat = requested[i].split("-");

            int r = Integer.parseInt(seat[0]);
            int c = Integer.parseInt(seat[1]);

            if(r < 1 || r > rows || c < 1 || c > cols)
            {
                System.out.println("Booking Failed");
                System.out.println("Invalid Seat : " + requested[i]);
                return;
            }

            for(int j = 0; j < booked.length; j++)
            {
                if(requested[i].equals(booked[j]))
                {
                    System.out.println("Booking Failed");
                    System.out.println("Seat Already Booked : " + requested[i]);
                    return;
                }
            }
        }

        int totalCost = 0;

        for(int i = 0; i < requested.length; i++)
        {
            String[] seat = requested[i].split("-");

            int r = Integer.parseInt(seat[0]);

            int price = 0;

            if(r == 1)
            {
                price = 200;
            }
            else if(r == 2)
            {
                price = 250;
            }
            else if(r == 3)
            {
                price = 300;
            }
            else
            {
                price = 350;
            }

            totalCost = totalCost + price;
        }

        int discount = 0;

        if(requested.length >= 6)
        {
            discount = (totalCost * 10) / 100;
        }

        totalCost = totalCost - discount;

        int totalSeats = rows * cols;
        int remainingSeats = totalSeats - booked.length - requested.length;

        System.out.println("Booking Successful");
        System.out.println("Total Cost : " + totalCost);
        System.out.println("Remaining Seats : " + remainingSeats);
    }
}

class program60
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRows = 0;
        int iCols = 0;

        String bookedSeats = null;
        String requestedSeats = null;

        System.out.println("Enter Number of Rows : ");
        iRows = sobj.nextInt();

        System.out.println("Enter Number of Columns : ");
        iCols = sobj.nextInt();

        sobj.nextLine();

        System.out.println("Enter Booked Seats : ");
        bookedSeats = sobj.nextLine();

        System.out.println("Enter Requested Seats : ");
        requestedSeats = sobj.nextLine();

        Cinema cobj = new Cinema();

        cobj.BookSeats(iRows, iCols, bookedSeats, requestedSeats);
    }
}
