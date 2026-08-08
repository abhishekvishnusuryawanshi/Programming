/*
Accept a directory name from user and display all names
of files from that directory which are regular files.
*/

import java.io.File;
import java.util.Scanner;

public class program36
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory path : ");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);

        if(dir.exists() && dir.isDirectory())
        {
            File[] files = dir.listFiles();

            System.out.println("\nRegular Files are :\n");

            for(File file : files)
            {
                if(file.isFile())
                {
                    System.out.println(file.getName());
                }
            }
        }
        else
        {
            System.out.println("Invalid Directory.");
        }

        sobj.close();
    }
}
