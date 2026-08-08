/*
Accept a directory name from user and write name and data of all files from that directory into one newly created file named as "Marvellous.txt".
*/

import java.io.*;
import java.util.Scanner;

public class program254
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
                    String str = "\nFile Name : " + file.getName() + "\n";
                    fout.write(str.getBytes());

                    FileInputStream fin = new FileInputStream(file);

                    while((iRet = fin.read(Buffer)) != -1)
                    {
                        fout.write(Buffer, 0, iRet);
                    }

                    fout.write("\n".getBytes());

                    fin.close();
                }
            }

            fout.close();

            System.out.println("File names and data are written into Marvellous.txt");
        }
        else
        {
            System.out.println("Invalid Directory.");
        }

        sobj.close();
    }
}
