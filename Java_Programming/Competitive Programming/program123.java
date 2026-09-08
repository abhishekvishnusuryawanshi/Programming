/*
    Customers submit support requests.
    Requests must normally be handled in the same order in which they arrive.
    Implement addRequest(), processRequest() and showPendingRequests().
*/

import java.util.*;

class program123
{
    public static void addRequest(Queue<String> queue, String request)
    {
        queue.add(request);
    }

    public static void processRequest(Queue<String> queue)
    {
        if(queue.isEmpty())
        {
            System.out.println("No pending requests");
        }
        else
        {
            System.out.println("Processing : " + queue.remove());
        }
    }

    public static void showPendingRequests(Queue<String> queue)
    {
        System.out.println("Pending Requests:");

        for(String request : queue)
        {
            System.out.println(request);
        }
    }

    public static void main(String args[])
    {
        Queue<String> queue = new LinkedList<String>();

        addRequest(queue, "R101");
        addRequest(queue, "R102");
        addRequest(queue, "R103");
        addRequest(queue, "R104");

        showPendingRequests(queue);

        System.out.println();

        processRequest(queue);
        processRequest(queue);

        System.out.println();

        showPendingRequests(queue);
    }
}
