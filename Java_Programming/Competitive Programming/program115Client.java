/*
    Develop a client-server application where the client can check
    whether a particular file exists on the server machine.
*/

import java.io.*;
import java.net.*;
import java.util.*;

public class program115Client
{
    public static void main(String args[])
    {
        try
        {
            Socket socket = new Socket("localhost", 5004);

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
