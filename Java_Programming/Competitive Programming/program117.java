/*
    A company records employee IDs whenever employees enter the office.
    Write a Java program that displays how many times each employee entered the office.
*/

import java.util.*;

class program332
{
    public static void main(String args[])
    {
        int Arr[] = {101, 102, 103, 101, 104, 102, 101, 105};

        HashMap<Integer, Integer> hobj = new HashMap<Integer, Integer>();

        for(int i = 0; i < Arr.length; i++)
        {
            if(hobj.containsKey(Arr[i]))
            {
                hobj.put(Arr[i], hobj.get(Arr[i]) + 1);
            }
            else
            {
                hobj.put(Arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : hobj.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
