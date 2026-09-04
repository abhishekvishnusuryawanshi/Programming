/*
Write a Java program to accept a string from the user and check whether the given string is a Palindrome or not.
*/

import java.util.Scanner;

class Palindrome
{
    public boolean CheckPalindrome(String str)
    {
        int start = 0;
        int end = str.length() -1;
        boolean bFlag = true;

        while(start < end)
    {
        if(str.charAt(start) != str.charAt(end))
        {
            bFlag = false;
            break;
        }

        start++;
        end--;
    }

    return bFlag;
    }
}

class program78
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        boolean bRet = false;

        System.out.println("Enter a String to Check Palindrome :");
        str = sobj.nextLine();

        Palindrome pobj = new Palindrome();
        bRet = pobj.CheckPalindrome(str);

        if(bRet == true)
        {
            System.out.println("String is Palindrome");
        }
        else
        {
                 System.out.println("String Not is Palindrome");
        }
    }
}
