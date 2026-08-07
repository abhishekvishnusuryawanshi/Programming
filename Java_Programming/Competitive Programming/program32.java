/*
Accept a file name and check whether it is a regular file or not.
*/

import java.io.File;
import java.util.Scanner;

public class program32
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sobj.nextLine();

        File file = new File(fileName);

        if(file.exists() && file.isFile())
        {
            System.out.println("Regular File");
        }
        else
        {
            System.out.println("Not a Regular File");
        }

        sobj.close();
    }
}
