/*
    A messaging application wants to identify the first character in a message
    that occurs only once.
*/

import java.util.*;

class program118
{
    public static void main(String args[])
    {
        String str = "programming";

        LinkedHashMap<Character, Integer> hobj =
            new LinkedHashMap<Character, Integer>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(hobj.containsKey(ch))
            {
                hobj.put(ch, hobj.get(ch) + 1);
            }
            else
            {
                hobj.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hobj.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println("First non-repeating character : "
                        + entry.getKey());
                break;
            }
        }
    }
}
