/*
    Program to check the Enter Number is Automorphic Number or Not.
*/
import java.util.Scanner;

class Automorphic
{
    public void CheckAutomorphic(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Original = iNo;
        int Square = iNo * iNo;
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

        if(Square % Power == Original)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}

class program73
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        Automorphic aobj = new Automorphic();
        aobj.CheckAutomorphic(iNo);
    }
}
