/*
Accept a directory name and create that directory.
*/

import java.io.File;
import java.util.Scanner;

public class program33
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);

        if(dir.mkdir())
        {
            System.out.println("Directory created successfully.");
        }
        else
        {
            System.out.println("Unable to create directory.");
        }

        sobj.close();
    }
}
