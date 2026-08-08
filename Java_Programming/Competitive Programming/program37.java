/*
Accept a directory name from user and write names of all files from that directory into one newly created file named as "Marvellous.txt".
*/

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class program252
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory path : ");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);

        if(dir.exists() && dir.isDirectory())
        {
            FileOutputStream fout = new FileOutputStream("Marvellous.txt");

            File[] files = dir.listFiles();

            for(File file : files)
            {
                if(file.isFile())
                {
                    String str = file.getName() + "\n";
                    fout.write(str.getBytes());
                }
            }

            fout.close();

            System.out.println("File names are written into Marvellous.txt");
        }
        else
        {
            System.out.println("Invalid Directory.");
        }

        sobj.close();
    }
}
