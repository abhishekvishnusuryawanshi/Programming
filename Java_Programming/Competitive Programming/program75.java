/*
    Program to check the Enter Number is Sunny Number or Not.
*/
import java.util.Scanner;

class SunnyNumber
{
    public void CheckSunny(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Number = iNo + 1;
        int i = 1;

        while(i * i < Number)
        {
            i++;
        }

        if(i * i == Number)
        {
            System.out.println("Sunny Number");
        }
        else
        {
            System.out.println("Not a Sunny Number");
        }
    }
}

class program75
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        SunnyNumber sobj1 = new SunnyNumber();
        sobj1.CheckSunny(iNo);
    }
}
