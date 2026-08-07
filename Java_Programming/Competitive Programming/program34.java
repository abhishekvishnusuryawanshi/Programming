/*
Accept a file name and calculate the checksum of that file.
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class program34
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sobj.nextLine();

        FileInputStream fis = new FileInputStream(fileName);

        int checksum = 0;
        int data;

        while((data = fis.read()) != -1)
        {
            checksum += data;
        }

        System.out.println("Checksum: " + checksum);

        fis.close();
        sobj.close();
    }
}
