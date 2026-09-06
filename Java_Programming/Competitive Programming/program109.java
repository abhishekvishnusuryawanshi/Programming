/*
    Write a Java program that accepts the names of a source file and destination file
    and copies all data from the source into the destination.
*/

import java.io.*;
import java.util.*;

class program109
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file:");
        String Source = sobj.nextLine();

        System.out.println("Enter destination file:");
        String Destination = sobj.nextLine();

        try
        {
            FileInputStream fi = new FileInputStream(Source);
            FileOutputStream fo = new FileOutputStream(Destination);

            int iRet = 0;

            while((iRet = fi.read()) != -1)
            {
                fo.write(iRet);
            }

            fi.close();
            fo.close();

            System.out.println("File copied successfully");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Source file does not exist");
        }
        catch(IOException e)
        {
            System.out.println("Unable to copy file");
        }
    }
}
