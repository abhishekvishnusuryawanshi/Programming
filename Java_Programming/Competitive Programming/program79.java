/*
Write a Java program to accept two strings from the user and check whether the given strings are Anagrams or not.
*/

import java.util.Arrays;
import java.util.Scanner;

class Anagram
{
    public boolean CheckAnagram(String str1 ,String str2)
    {
        boolean bFlag = false;

        if(str1.length() != str2.length())
        {
            bFlag = false;
            return bFlag;
        }

        char Arr1[] = str1.toCharArray();
        char Arr2[] = str2.toCharArray();

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        if(Arrays.equals(Arr1, Arr2))
        {
            bFlag = true;
        }

        return bFlag;
   
    }
}

class program79
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null;
        String str2 = null;
        boolean bRet = false;

        System.out.println("Enter a First String :");
        str1 = sobj.nextLine();

        System.out.println("Enter a Secound String:");
        str2 = sobj.nextLine();

        Anagram aobj = new Anagram();

        bRet = aobj.CheckAnagram(str1 , str2);

        if(bRet == true)
        {
            System.out.println("String is Anagram");
        }
        else
        {
            System.out.println("String Not is Anagram");
        }
    }
}
