import java.io.*;
import java.net.*;
import java.util.*;

public class program99
{
    public static void main(String args[])
    {
        try
        {
            Socket socket = new Socket("localhost", 5000);

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

                if(command.equalsIgnoreCase("QUIT"))
                {
                    break;
                }
            }

            socket.close();
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
