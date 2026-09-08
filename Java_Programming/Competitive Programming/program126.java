/*
    An e-commerce application records product IDs.
    Write a Java program to find the top 2 most frequently purchased products.
*/

import java.util.*;

class program126
{
    public static void main(String args[])
    {
        int Arr[] =
        {
            101, 102, 101, 103, 101, 102, 104, 105, 102, 103
        };

        HashMap<Integer, Integer> hobj =
            new HashMap<Integer, Integer>();

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

        ArrayList<Map.Entry<Integer, Integer>> list =
            new ArrayList<Map.Entry<Integer, Integer>>(hobj.entrySet());

        Collections.sort(list,
            new Comparator<Map.Entry<Integer, Integer>>()
            {
                public int compare(
                    Map.Entry<Integer, Integer> e1,
                    Map.Entry<Integer, Integer> e2)
                {
                    return e2.getValue() - e1.getValue();
                }
            }
        );

        System.out.println("Top 2 products:");

        for(int i = 0; i < 2 && i < list.size(); i++)
        {
            System.out.println(
                list.get(i).getKey() + " -> "
                + list.get(i).getValue());
        }
    }
}
