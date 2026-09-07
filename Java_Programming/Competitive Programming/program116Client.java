/*
    Develop a client-server application where the client can request
    information about a file stored on the server.
*/

import java.io.*;
import java.net.*;
import java.util.*;

public class program116Client
{
    public static void main(String args[])
    {
        try
        {
            Socket socket = new Socket("localhost", 5005);

            BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            PrintWriter pw = new PrintWriter(
                socket.getOutputStream(), true);

            Scanner sobj = new Scanner(System.in);

            while(true)
            {
                System.out.print("Enter command : ");
                String command = sobj.nextLine();

                pw.println(command);

                String response = br.readLine();

                System.out.println("Server : " + response);

                if(command.equalsIgnoreCase("QUIT"))
                {
                    break;
                }
            }

            socket.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
