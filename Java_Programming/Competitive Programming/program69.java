/*
    Program to check the Enter Number is Perfect Number or Not.
*/
import java.util.Scanner;

class PerfectNumber
{
    public void CheckPerfect(int iNo)
    {
        if(iNo <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Sum = 0;

        for(int i = 1; i <= iNo / 2; i++)
        {
            if(iNo % i == 0)
            {
                Sum = Sum + i;
            }
        }

        if(Sum == iNo)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}

class program69
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        PerfectNumber pobj = new PerfectNumber();
        pobj.CheckPerfect(iNo);
    }
}
