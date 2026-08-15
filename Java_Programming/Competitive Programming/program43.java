/*
Student Result: Accept marks of five subjects, validate the marks, calculate the average, and display the student's result/classification.
*/
import java.util.*;

class program43
{
    public static void Result(int Arr[])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < 0 || Arr[i] > 100)
            {
                System.out.println("Please Enter Valid Marks");
                return;
            }
        }

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < 35)
            {
                System.out.println("Result : Fail");
                return;
            }
        }

        int iTotal = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            iTotal = iTotal + Arr[i];
        }

        double dAverage = iTotal / 5.0;

        System.out.println("Total Marks : " + iTotal);
        System.out.println("Average : " + dAverage);

        if(dAverage >= 75)
        {
            System.out.println("Result : Distinction");
        }
        else if(dAverage >= 60)
        {
            System.out.println("Result : First Class");
        }
        else if(dAverage >= 50)
        {
            System.out.println("Result : Second Class");
        }
        else
        {
            System.out.println("Result : Pass");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[5];

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter Marks of Subject " + (i + 1) + " : ");
            Arr[i] = sobj.nextInt();
        }

        Result(Arr);
    }
}
