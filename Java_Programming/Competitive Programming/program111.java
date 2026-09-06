/*
    Write a Java application that accepts the path of a directory
    and displays all files and directories present inside it.
*/

import java.io.*;
import java.util.*;

class program111
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory:");
        String Dir = sobj.nextLine();

        File fobj = new File(Dir);

        if(fobj.exists())
        {
            if(fobj.isDirectory())
            {
                String Arr[] = fobj.list();

                System.out.println("Contents:");

                for(int i = 0; i < Arr.length; i++)
                {
                    System.out.println(Arr[i]);
                }
            }
            else
            {
                System.out.println("Path is not a directory");
            }
        }
        else
        {
            System.out.println("Directory does not exist");
        }
    }
}
