/*
    Write a program to Find the Largest word in sentance.
*/
import java.util.*;

class stringX
{
    public void FindLargestWord(String str)
    {
        String parts[] = str.split(" ");

        String largest = "";

        for(int i = 0; i < parts.length; i++)
        {
            if(parts[i].length() > largest.length())
            {
                largest = parts[i];
            }
        }

        System.out.println("Largest word is : " + largest);
    }
}

class program84
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        stringX xobj = new stringX();

        xobj.FindLargestWord(str);

    }
}
