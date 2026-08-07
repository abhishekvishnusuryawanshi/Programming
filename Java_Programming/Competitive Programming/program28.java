/*
Accept a file name and create a new file if it does not exist
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class program28
 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sobj.nextLine();

        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file.");
        }

        sobj.close();
    }
}
