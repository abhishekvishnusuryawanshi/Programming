/*
    Program to check the Enter Number is Palindrome or Not.
*/
import java.util.Scanner;

class Palindrome
{
    public void CheckPalindrome(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Original = iNo;
        int Reverse = 0;

        while(iNo != 0)
        {
            int Digit = iNo % 10;
            Reverse = (Reverse * 10) + Digit;
            iNo = iNo / 10;
        }

        if(Reverse == Original)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}

class program71
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        Palindrome pobj = new Palindrome();
        pobj.CheckPalindrome(iNo);
    }
}
