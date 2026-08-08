/*
Accept a directory name from user and write data of all files from that directory into one newly created file named as "Marvellous.txt".
*/

import java.io.*;
import java.util.Scanner;

public class program253
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

            byte[] Buffer = new byte[1024];
            int iRet = 0;

            for(File file : files)
            {
                if(file.isFile())
                {
                    FileInputStream fin = new FileInputStream(file);

                    while((iRet = fin.read(Buffer)) != -1)
                    {
                        fout.write(Buffer, 0, iRet);
                    }

                    fin.close();
                }
            }

            fout.close();

            System.out.println("Data of all files copied into Marvellous.txt");
        }
        else
        {
            System.out.println("Invalid Directory.");
        }

        sobj.close();
    }
}
