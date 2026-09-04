/*
Write a Java program to accept string from the user and check whether the given string is Pangram or not.
*/

import java.util.*;

class Pangram
{
   public boolean CheckPangram(String str)
    {
        boolean bFlag = true;

        str = str.toLowerCase();

        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            if(str.indexOf(ch) == -1)
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }
}

class program80
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        boolean bRet = false;

        System.out.println("Enter a  String :");
        str = sobj.nextLine();

        Pangram pobj = new Pangram();
        bRet = pobj.CheckPangram(str);

        if(bRet == true)
        {
            System.out.println("String is Pangram");
        }
        else
        {
            System.out.println("String Not is Pangram");
        }
    }
}
