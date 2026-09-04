/*
    Write a program to reverse the word in sentance
*/

import java.util.*;

class stringX
{
    public void StringReverse(String str)
    {
        String parts[] = str.split(" ");

        for(int i = 0; i < parts.length; i++)
        {
            String word = parts[i];

            for(int j = word.length() - 1; j >= 0; j--)
            {
                System.out.print(word.charAt(j));
            }

            System.out.print(" ");
        }

    }
}

class program83
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        stringX xobj = new stringX();

        xobj.StringReverse(str);

    }
}
