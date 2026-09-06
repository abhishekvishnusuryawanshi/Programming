import java.io.*;
import java.net.*;
import java.time.*;

class InfoClientHandler extends Thread
{
    private Socket socket;

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
                command = command.toUpperCase();

                switch(command)
                {
                    case "DATE":
                        pw.println(LocalDate.now());
                        break;

                    case "TIME":
                        pw.println(LocalTime.now());
                        break;

                    case "SERVERNAME":
                        pw.println(InetAddress.getLocalHost().getHostName());
                        break;

                    case "HELP":
                        pw.println("Available Commands:");
                        pw.println("DATE");
                        pw.println("TIME");
                        pw.println("SERVERNAME");
                        pw.println("HELP");
                        pw.println("QUIT");
                        break;

                    case "QUIT":
                        pw.println("Connection closed");
                        socket.close();
                        return;

                    default:
                        pw.println("Invalid command. Type HELP");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class program104
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss = new ServerSocket(5003);

            System.out.println("Information Server started...");
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket socket = ss.accept();

                System.out.println("Client connected");

                InfoClientHandler handler =
                    new InfoClientHandler(socket);

                handler.start();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
