/*
    Program to check the Enter Number is Harshad Number or Not.
*/
import java.util.Scanner;

class HarshadNumber
{
    public void CheckHarshad(int iNo)
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
            Sum = Sum + Digit;
            iNo = iNo / 10;
        }

        if(Original % Sum == 0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }
    }
}

class program70
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        HarshadNumber hobj = new HarshadNumber();
        hobj.CheckHarshad(iNo);
    }
}
