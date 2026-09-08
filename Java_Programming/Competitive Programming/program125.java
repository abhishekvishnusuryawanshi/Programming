/*
    Write a Java program that accepts a sentence and finds
    the most frequently occurring word.
*/

import java.util.*;

class program125
{
    public static void main(String args[])
    {
        String str = "java python java c java python cpp";

        String Arr[] = str.split(" ");

        HashMap<String, Integer> hobj =
            new HashMap<String, Integer>();

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

        String word = "";
        int frequency = 0;

        for(Map.Entry<String, Integer> entry : hobj.entrySet())
        {
            if(entry.getValue() > frequency)
            {
                word = entry.getKey();
                frequency = entry.getValue();
            }
        }

        System.out.println("Most frequent word : " + word);
        System.out.println("Frequency : " + frequency);
    }
}
