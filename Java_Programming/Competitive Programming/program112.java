 /*
    Write a Java program to extend the previous assignment to distinguish
    between files and directories and display the size of files.
*/

import java.io.*;
import java.util.*;

class program112
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory:");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.exists())
        {
            if(fobj.isDirectory())
            {
                File Arr[] = fobj.listFiles();

                for(int i = 0; i < Arr.length; i++)
                {
                    if(Arr[i].isFile())
                    {
                        System.out.println("[FILE] " + Arr[i].getName()
                                + "    " + Arr[i].length() + " bytes");
                    }
                    else if(Arr[i].isDirectory())
                    {
                        System.out.println("[DIR] " + Arr[i].getName());
                    }
                }
            }
            else
            {
                System.out.println("It is not a directory");
            }
        }
        else
        {
            System.out.println("Directory does not exist");
        }
    }
}
