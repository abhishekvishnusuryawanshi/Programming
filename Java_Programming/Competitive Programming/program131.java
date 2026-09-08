/*
    Social Network Shortest Connection
*/
import java.util.*;

class program131
{
    public static void main(String args[])
    {
        HashMap<String, ArrayList<String>> graph =
            new HashMap<String, ArrayList<String>>();

        graph.put("Amit", new ArrayList<String>());
        graph.put("Rahul", new ArrayList<String>());
        graph.put("Pooja", new ArrayList<String>());
        graph.put("Neha", new ArrayList<String>());
        graph.put("Kiran", new ArrayList<String>());
        graph.put("Riya", new ArrayList<String>());

        graph.get("Amit").add("Rahul");
        graph.get("Amit").add("Pooja");

        graph.get("Rahul").add("Neha");

        graph.get("Pooja").add("Kiran");

        graph.get("Neha").add("Riya");

        graph.get("Kiran").add("Riya");

        Queue<String> queue = new LinkedList<String>();

        HashMap<String, Boolean> visited =
            new HashMap<String, Boolean>();

        HashMap<String, Integer> distance =
            new HashMap<String, Integer>();

        queue.add("Amit");
        visited.put("Amit", true);
        distance.put("Amit", 0);

        while(!queue.isEmpty())
        {
            String current = queue.remove();

            for(String neighbour : graph.get(current))
            {
                if(!visited.containsKey(neighbour))
                {
                    visited.put(neighbour, true);

                    distance.put(neighbour,
                        distance.get(current) + 1);

                    queue.add(neighbour);
                }
            }
        }

        System.out.println("Minimum connections from Amit to Riya : "+ distance.get("Riya"));
    }
}
