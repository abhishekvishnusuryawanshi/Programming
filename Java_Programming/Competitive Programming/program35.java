/*
Accept a directory name and display all file names along with the size of each file in that directory.
*/

import java.io.File;
import java.util.Scanner;

public class program35
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);

        if(dir.exists() && dir.isDirectory())
        {
            File[] files = dir.listFiles();

            System.out.println("Files in directory:");

            for(File file : files)
            {
                if(file.isFile())
                {
                    System.out.println(file.getName() + " : " + file.length() + " bytes");
                }
            }
        }
        else
        {
            System.out.println("Invalid directory.");
        }

        sobj.close();
    }
}
