/*
    Program to check the Enter Number is Trimorphic Number or Not.
*/
import java.util.Scanner;

class Trimorphic
{
    public void CheckTrimorphic(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Original = iNo;
        int Cube = iNo * iNo * iNo;
        int Temp = iNo;
        int Count = 0;
        int Power = 1;

        while(Temp != 0)
        {
            Count++;
            Temp = Temp / 10;
        }

        for(int i = 1; i <= Count; i++)
        {
            Power = Power * 10;
        }

        if(Cube % Power == Original)
        {
            System.out.println("Trimorphic Number");
        }
        else
        {
            System.out.println("Not a Trimorphic Number");
        }
    }
}

class program77

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        Trimorphic tobj = new Trimorphic();
        tobj.CheckTrimorphic(iNo);
    }
}
