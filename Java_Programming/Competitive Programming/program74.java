/*
    Program to check the Enter Number is Spy Number or Not.
*/
import java.util.Scanner;

class SpyNumber
{
    public void CheckSpy(int iNo)
    {
        if(iNo <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Sum = 0;
        int Product = 1;

        while(iNo != 0)
        {
            int Digit = iNo % 10;

            Sum = Sum + Digit;
            Product = Product * Digit;

            iNo = iNo / 10;
        }

        if(Sum == Product)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not a Spy Number");
        }
    }
}

class program74
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        SpyNumber sobj1 = new SpyNumber();
        sobj1.CheckSpy(iNo);
    }
}
