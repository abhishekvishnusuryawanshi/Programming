/*
    Program to check the Enter Number is Armstrong Number or Not.
*/
import java.util.Scanner;

class Armstrong
{
    public void CheckArmstrong(int iNo)
    {
        int Original = iNo;
        int Temp = iNo;
        int Count = 0;
        int Sum = 0;

        while(Temp != 0)
        {
            Count++;
            Temp = Temp / 10;
        }

        Temp = iNo;

        while(Temp != 0)
        {
            int Digit = Temp % 10;
            int Power = 1;

            for(int i = 1; i <= Count; i++)
            {
                Power = Power * Digit;
            }

            Sum = Sum + Power;
            Temp = Temp / 10;
        }

        if(Sum == Original)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}

class program68
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        Armstrong aobj = new Armstrong();
        aobj.CheckArmstrong(iNo);
    }
}
