import java.io.*;
import java.net.*;

class ClientHandler extends Thread
{
    private Socket socket;

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
                String[] parts = command.split(" ");

                if(parts[0].equalsIgnoreCase("QUIT"))
                {
                    pw.println("Goodbye!");
                    break;
                }

                if(parts.length != 3)
                {
                    pw.println("Invalid command");
                    continue;
                }

                try
                {
                    String operation = parts[0].toUpperCase();
                    double num1 = Double.parseDouble(parts[1]);
                    double num2 = Double.parseDouble(parts[2]);

                    double result;

                    switch(operation)
                    {
                        case "ADD":
                            result = num1 + num2;
                            pw.println("Result is : " + result);
                            break;

                        case "SUB":
                            result = num1 - num2;
                            pw.println("Result is : " + result);
                            break;

                        case "MULT":
                            result = num1 * num2;
                            pw.println("Result is : " + result);
                            break;

                        case "DIV":
                            if(num2 == 0)
                            {
                                pw.println("Error: Division by zero");
                            }
                            else
                            {
                                result = num1 / num2;
                                pw.println("Result is : " + result);
                            }
                            break;

                        case "MOD":
                            if(num2 == 0)
                            {
                                pw.println("Error: Modulo by zero");
                            }
                            else
                            {
                                result = num1 % num2;
                                pw.println("Result is : " + result);
                            }
                            break;

                        case "MAX":
                            result = Math.max(num1, num2);
                            pw.println("Maximum number is : " + result);
                            break;

                        case "MIN":
                            result = Math.min(num1, num2);
                            pw.println("Minimum number is : " + result);
                            break;

                        default:
                            pw.println("Invalid command");
                    }
                }
                catch(NumberFormatException e)
                {
                    pw.println("Invalid numbers");
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

public class program313
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server started...");
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket socket = ss.accept();

                System.out.println("Client connected");

                ClientHandler ch = new ClientHandler(socket);
                ch.start();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
