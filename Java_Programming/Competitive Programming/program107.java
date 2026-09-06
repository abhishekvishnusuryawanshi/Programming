/*
    Write a Java program that accepts a filename and textual data from the user
    and stores that data inside the specified file.
*/

import java.io.*;
import java.util.*;

class program107
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String Fname = sobj.nextLine();

        System.out.println("Enter data:");
        String Data = sobj.nextLine();

        try
        {
            FileOutputStream fo = new FileOutputStream(Fname);

            byte Arr[] = Data.getBytes();

            fo.write(Arr);

            fo.close();

            System.out.println("Data written successfully");
        }
        catch(Exception e)
        {
            System.out.println("Unable to write data");
        }
    }
}
