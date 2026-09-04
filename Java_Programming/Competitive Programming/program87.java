/*
    write a program to check whether one string is rotation of another
*/

import java.util.Scanner;

class stringX
{
    public boolean CheckRotation(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        String temp = str1 + str1;

        return temp.contains(str2);
    }
}

class program87
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        String str2 = sobj.nextLine();

        stringX obj = new stringX();

        boolean bRet = obj.CheckRotation(str1, str2);

        if(bRet == true)
        {
            System.out.println("String is a rotation");
        }
        else
        {
            System.out.println("String is not a rotation");
        }
    }
}
