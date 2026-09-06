/*
    Write a Java application that accepts a filename from the user
    and displays the complete contents of that file.
*/

import java.io.*;
import java.util.*;

class program108
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String Fname = sobj.nextLine();

        try
        {
            FileInputStream fi = new FileInputStream(Fname);

            int iRet = 0;

            while((iRet = fi.read()) != -1)
            {
                System.out.print((char)iRet);
            }

            fi.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist");
        }
        catch(IOException e)
        {
            System.out.println("Unable to read file");
        }
    }
}
