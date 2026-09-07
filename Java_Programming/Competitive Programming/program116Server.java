/*
    Develop a client-server application where the client can request
    information about a file stored on the server.
*/

import java.io.*;
import java.net.*;

class InfoClientHandler extends Thread
{
    Socket socket;

    InfoClientHandler(Socket socket)
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

                if(Arr[0].equalsIgnoreCase("INFO"))
                {
                    File fobj = new File(Arr[1]);

                    if(fobj.exists() && fobj.isFile())
                    {
                        pw.println("File Name : " + fobj.getName());
                        pw.println("Size : " + fobj.length() + " bytes");
                        pw.println("Readable : " + fobj.canRead());
                        pw.println("Writable : " + fobj.canWrite());
                        pw.println("Absolute Path : "
                                + fobj.getAbsolutePath());
                    }
                    else
                    {
                        pw.println("File does not exist on server");
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

public class program116Server
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss = new ServerSocket(5005);

            System.out.println("Server started...");

            while(true)
            {
                Socket socket = ss.accept();

                InfoClientHandler obj =
                    new InfoClientHandler(socket);

                obj.start();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
