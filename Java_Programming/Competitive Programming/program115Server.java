/*
    Develop a client-server application where the client can check
    whether a particular file exists on the server machine.
*/

import java.io.*;
import java.net.*;

class ClientHandler extends Thread
{
    Socket socket;

    ClientHandler(Socket socket)
    {
        this.socket = socket;
    }

    public void run()
    {
        try
        {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            PrintWriter pw = new PrintWriter(
                socket.getOutputStream(), true);

            String command;

            while((command = br.readLine()) != null)
            {
                String Arr[] = command.split(" ", 2);

                if(Arr.length != 2)
                {
                    pw.println("Invalid command");
                    continue;
                }

                if(Arr[0].equalsIgnoreCase("EXISTS"))
                {
                    File fobj = new File(Arr[1]);

                    if(fobj.exists() && fobj.isFile())
                    {
                        pw.println(Arr[1] + " exists on server");
                    }
                    else
                    {
                        pw.println(Arr[1] + " does not exist on server");
                    }
                }
                else
                {
                    pw.println("Invalid command");
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

public class program115Server
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss = new ServerSocket(5004);

            System.out.println("Server started...");

            while(true)
            {
                Socket socket = ss.accept();

                ClientHandler obj = new ClientHandler(socket);
                obj.start();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
