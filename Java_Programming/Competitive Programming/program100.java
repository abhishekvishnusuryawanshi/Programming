import java.io.*;
import java.net.*;

class NumberClientHandler extends Thread
{
    private Socket socket;

    NumberClientHandler(Socket socket)
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

                if(parts.length != 2)
                {
                    pw.println("Invalid command");
                    continue;
                }

                String operation = parts[0].toUpperCase();

                try
                {
                    int number = Integer.parseInt(parts[1]);

                    switch(operation)
                    {
                        case "EVEN":
                            checkEven(number, pw);
                            break;

                        case "ODD":
                            checkOdd(number, pw);
                            break;

                        case "PRIME":
                            checkPrime(number, pw);
                            break;

                        case "PERFECT":
                            checkPerfect(number, pw);
                            break;

                        case "FACTORIAL":
                            factorial(number, pw);
                            break;

                        case "REVERSE":
                            reverse(number, pw);
                            break;

                        default:
                            pw.println("Invalid operation");
                    }
                }
                catch(NumberFormatException e)
                {
                    pw.println("Invalid number");
                }
            }

            socket.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void checkEven(int number, PrintWriter pw)
    {
        if(number % 2 == 0)
        {
            pw.println(number + " is Even");
        }
        else
        {
            pw.println(number + " is Not Even");
        }
    }

    public void checkOdd(int number, PrintWriter pw)
    {
        if(number % 2 != 0)
        {
            pw.println(number + " is Odd");
        }
        else
        {
            pw.println(number + " is Not Odd");
        }
    }

    public void checkPrime(int number, PrintWriter pw)
    {
        if(number < 2)
        {
            pw.println(number + " is Not a Prime Number");
            return;
        }

        boolean flag = true;

        for(int i = 2; i <= number / 2; i++)
        {
            if(number % i == 0)
            {
                flag = false;
                break;
            }
        }

        if(flag)
        {
            pw.println(number + " is a Prime Number");
        }
        else
        {
            pw.println(number + " is Not a Prime Number");
        }
    }

    public void checkPerfect(int number, PrintWriter pw)
    {
        if(number <= 0)
        {
            pw.println(number + " is Not a Perfect Number");
            return;
        }

        int sum = 0;

        for(int i = 1; i <= number / 2; i++)
        {
            if(number % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == number)
        {
            pw.println(number + " is a Perfect Number");
        }
        else
        {
            pw.println(number + " is Not a Perfect Number");
        }
    }

    public void factorial(int number, PrintWriter pw)
    {
        if(number < 0)
        {
            pw.println("Factorial is not defined for negative numbers");
            return;
        }

        long fact = 1;

        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }

        pw.println("Factorial is : " + fact);
    }

    public void reverse(int number, PrintWriter pw)
    {
        int reverse = 0;
        int temp = number;

        while(temp != 0)
        {
            int digit = temp % 10;

            reverse = reverse * 10 + digit;

            temp = temp / 10;
        }

        pw.println("Reverse is : " + reverse);
    }
}

public class program100
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss = new ServerSocket(5001);

            System.out.println("Number Server started...");
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket socket = ss.accept();

                System.out.println("Client connected");

                NumberClientHandler handler =
                    new NumberClientHandler(socket);

                handler.start();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
