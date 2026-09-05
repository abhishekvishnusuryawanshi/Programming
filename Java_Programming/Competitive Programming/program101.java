import java.io.*;
import java.net.*;
import java.util.*;

public class program101
{
    public static void main(String args[])
    {
        try
        {
            Socket socket = new Socket("localhost", 5001);

            BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            PrintWriter pw = new PrintWriter(
                socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            while(true)
            {
                System.out.print("Enter command : ");
                String command = sc.nextLine();

                pw.println(command);

                String response = br.readLine();

                System.out.println("Server : " + response);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
