/*
    Write a Java application that accepts a filename
    and displays detailed information about that file.
*/

import java.io.*;
import java.util.*;

class program110
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String Fname = sobj.nextLine();

        File fobj = new File(Fname);

        if(fobj.exists())
        {
            System.out.println("File Name      : " + fobj.getName());
            System.out.println("Absolute Path  : " + fobj.getAbsolutePath());
            System.out.println("File Size      : " + fobj.length() + " bytes");
            System.out.println("Readable       : " + fobj.canRead());
            System.out.println("Writable       : " + fobj.canWrite());
            System.out.println("Hidden         : " + fobj.isHidden());
            System.out.println("Last Modified  : " + fobj.lastModified());
        }
        else
        {
            System.out.println("File does not exist");
        }
    }
}
