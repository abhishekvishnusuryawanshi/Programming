/*
    Write a Java program that accepts a directory path and a filename from the user
    and searches for the specified file inside the directory.
*/

import java.io.*;
import java.util.*;

class program113
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory:");
        String Dir = sobj.nextLine();

        System.out.println("Enter file to search:");
        String Fname = sobj.nextLine();

        File fobj = new File(Dir);

        if(fobj.exists() && fobj.isDirectory())
        {
            File Arr[] = fobj.listFiles();

            boolean bFlag = false;

            for(int i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile() &&
                   Arr[i].getName().equalsIgnoreCase(Fname))
                {
                    System.out.println("File found");
                    System.out.println();
                    System.out.println("Name : " + Arr[i].getName());
                    System.out.println("Size : " + Arr[i].length() + " bytes");
                    System.out.println("Path : " + Arr[i].getAbsolutePath());

                    bFlag = true;
                    break;
                }
            }

            if(bFlag == false)
            {
                System.out.println();
                System.out.println(Fname + " not found");
            }
        }
        else
        {
            System.out.println("Invalid directory");
        }
    }
}
