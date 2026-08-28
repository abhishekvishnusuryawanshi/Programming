/*
    Program to Search a StrongNumber from the given Input.
*/
import java.util.Scanner;

class StrongNumber
{
    public void CheckStrong(int iNo)
    {
        if(iNo <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Original = iNo;
        int Sum = 0;

        while(iNo != 0)
        {
            int Digit = iNo % 10;
            int Fact = 1;

            for(int i = 1; i <= Digit; i++)
            {
                Fact = Fact * i;
            }

            Sum = Sum + Fact;
            iNo = iNo / 10;
        }

        if(Sum == Original)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
    }
}

class program67
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        StrongNumber snobj1 = new StrongNumber();
        snobj1.CheckStrong(iNo);
    }
}
