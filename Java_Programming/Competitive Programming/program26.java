/*
Accept a file name from the user and open that file
*/

import java.io.File;
import java.util.Scanner;

public class program26
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sobj.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File opened successfully.");
        } else {
            System.out.println("File does not exist.");
        }

        sobj.close();
    }
}
