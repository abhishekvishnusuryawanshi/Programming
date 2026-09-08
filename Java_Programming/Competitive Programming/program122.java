/*
    A browser wants to store only the last 5 visited websites.
    Write a Java program to maintain the browsing history.
*/

import java.util.*;

class program122
{
    public static void main(String args[])
    {
        LinkedList<String> history = new LinkedList<String>();

        String Arr[] =
        {
            "google.com",
            "github.com",
            "openai.com",
            "oracle.com",
            "stackoverflow.com",
            "youtube.com"
        };

        for(int i = 0; i < Arr.length; i++)
        {
            history.add(Arr[i]);

            if(history.size() > 5)
            {
                history.removeFirst();
            }
        }

        System.out.println("Browsing History:");

        for(int i = 0; i < history.size(); i++)
        {
            System.out.println(history.get(i));
        }
    }
}
