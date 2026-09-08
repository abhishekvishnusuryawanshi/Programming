/*
    Software Dependency Resolver
*/
import java.util.*;

class program130
{
    public static void main(String args[])
    {
        HashMap<String, ArrayList<String>> graph =
            new HashMap<String, ArrayList<String>>();

        graph.put("Database", new ArrayList<String>());
        graph.put("Backend", new ArrayList<String>());
        graph.put("API", new ArrayList<String>());
        graph.put("Frontend", new ArrayList<String>());

        graph.get("Database").add("Backend");
        graph.get("Backend").add("API");
        graph.get("API").add("Frontend");

        HashMap<String, Integer> indegree =
            new HashMap<String, Integer>();

        for(String node : graph.keySet())
        {
            indegree.put(node, 0);
        }

        for(String node : graph.keySet())
        {
            for(String neighbour : graph.get(node))
            {
                indegree.put(neighbour,
                    indegree.get(neighbour) + 1);
            }
        }

        Queue<String> queue = new LinkedList<String>();

        for(String node : indegree.keySet())
        {
            if(indegree.get(node) == 0)
            {
                queue.add(node);
            }
        }

        System.out.println("Valid initialization order:");

        while(!queue.isEmpty())
        {
            String current = queue.remove();

            System.out.println(current);

            for(String neighbour : graph.get(current))
            {
                indegree.put(neighbour,
                    indegree.get(neighbour) - 1);

                if(indegree.get(neighbour) == 0)
                {
                    queue.add(neighbour);
                }
            }
        }
    }
}
