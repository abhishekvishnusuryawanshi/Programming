import java.io.*;
import java.net.*;

class StringClientHandler extends Thread
{
    private Socket socket;

    StringClientHandler(Socket socket)
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
                String[] parts = command.split(" ", 2);

                if(parts.length != 2)
                {
                    pw.println("Invalid command");
                    continue;
                }

                String operation = parts[0].toUpperCase();
                String str = parts[1];

                switch(operation)
                {
                    case "LENGTH":
                        pw.println("Length is : " + str.length());
                        break;

                    case "UPPER":
                        pw.println(str.toUpperCase());
                        break;

                    case "LOWER":
                        pw.println(str.toLowerCase());
                        break;

                    case "REVERSE":
                        pw.println(reverse(str));
                        break;

                    case "PALINDROME":
                        if(str.equalsIgnoreCase(reverse(str)))
                        {
                            pw.println(str + " is a Palindrome");
                        }
                        else
                        {
                            pw.println(str + " is Not a Palindrome");
                        }
                        break;

                    case "VOWELS":
                        pw.println("Number of vowels : " + countVowels(str));
                        break;

                    default:
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

    public String reverse(String str)
    {
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    public int countVowels(String str)
    {
        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u')
            {
                count++;
            }
        }

        return count;
    }
}

public class program102
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss = new ServerSocket(5002);

            System.out.println("String Server started...");
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket socket = ss.accept();

                System.out.println("Client connected");

                StringClientHandler handler =
                    new StringClientHandler(socket);

                handler.start();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
