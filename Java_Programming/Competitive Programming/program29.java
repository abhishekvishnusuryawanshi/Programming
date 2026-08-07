/*
Accept a file name, open it in write mode, and append data
*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program29
{
    public static void main(String[] args) 
  {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sobj.nextLine();

        System.out.print("Enter data to append: ");
        String data = sobj.nextLine();

        try {
            FileWriter writer = new FileWriter(fileName, true); // true = append mode
            writer.write(data + "\n");
            writer.close();

            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        sobj.close();
    }
}
