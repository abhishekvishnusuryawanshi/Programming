/*
    A banking application receives transaction IDs.
    Write a Java program to identify duplicate transaction IDs.
*/

import java.util.*;

class program120
{
    public static void main(String args[])
    {
        String Arr[] =
        {
            "TX101",
            "TX102",
            "TX103",
            "TX101",
            "TX104",
            "TX102"
        };

        HashSet<String> hobj = new HashSet<String>();

        System.out.println("Duplicate transactions:");

        for(int i = 0; i < Arr.length; i++)
        {
            if(hobj.contains(Arr[i]))
            {
                System.out.println(Arr[i]);
            }
            else
            {
                hobj.add(Arr[i]);
            }
        }
    }
}
