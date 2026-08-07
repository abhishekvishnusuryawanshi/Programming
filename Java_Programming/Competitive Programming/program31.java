/*
Accept two file names from the user and copy the contents of the first file into the second file.
*/

import java.io.*;
import java.util.Scanner;

public class program246
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String source = sobj.nextLine();

        System.out.print("Enter destination file name: ");
        String destination = sobj.nextLine();

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);

        byte[] buffer = new byte[1024];
        int bytesRead;

        while((bytesRead = fis.read(buffer)) != -1)
        {
            fos.write(buffer, 0, bytesRead);
        }

        System.out.println("File copied successfully.");

        fis.close();
        fos.close();
        sobj.close();
    }
}
