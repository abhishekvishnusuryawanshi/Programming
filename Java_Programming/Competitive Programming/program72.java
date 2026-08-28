/*
    Program to check the Enter Number is Neon Number or Not.
*/
import java.util.Scanner;

class NeonNumber
{
    public void CheckNeon(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Original = iNo;
        int Square = iNo * iNo;
        int Sum = 0;

        while(Square != 0)
        {
            int Digit = Square % 10;
            Sum = Sum + Digit;
            Square = Square / 10;
        }

        if(Sum == Original)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not a Neon Number");
        }
    }
}

class program72
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        NeonNumber nobj = new NeonNumber();
        nobj.CheckNeon(iNo);
    }
}
