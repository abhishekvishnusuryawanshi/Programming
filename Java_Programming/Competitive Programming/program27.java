/*
Accept a file name, open it, and display its contents
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class program27
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sobj.nextLine();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) 
            {
                System.out.println(reader.nextLine());
            }

            reader.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found.");
        }

        sobj.close();
    }
}
