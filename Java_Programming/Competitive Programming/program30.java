/*
Accept a directory name and display all file names in that directory
*/

import java.io.File;
import java.util.Scanner;

public class program245 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);

        if (dir.exists() && dir.isDirectory()) {
            String[] files = dir.list();

            System.out.println("Files in directory:");
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Invalid directory.");
        }

        sobj.close();
    }
}
