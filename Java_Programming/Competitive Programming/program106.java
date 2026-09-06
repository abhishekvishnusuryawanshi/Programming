import java.io.*;
import java.util.*;

public class program106
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        try
        {
            boolean bRet = file.createNewFile();

            System.out.println();
            System.out.println("File Name : " + file.getName());
            System.out.println("Absolute Path : " + file.getAbsolutePath());

            if(bRet == true)
            {
                System.out.println("File created successfully");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("Unable to create file");
        }

        sc.close();
    }
}
