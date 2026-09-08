/*
    Group Employees Department-Wise
*/
import java.util.*;

class program129
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees : ");
        int n = sc.nextInt();

        sc.nextLine();

        HashMap<String, ArrayList<String>> map =
            new HashMap<String, ArrayList<String>>();

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter employee name : ");
            String name = sc.nextLine();

            System.out.print("Enter department : ");
            String dept = sc.nextLine();

            if(!map.containsKey(dept))
            {
                map.put(dept, new ArrayList<String>());
            }

            map.get(dept).add(name);
        }

        for(String dept : map.keySet())
        {
            System.out.println("\n" + dept + ":");

            ArrayList<String> employees = map.get(dept);

            for(String name : employees)
            {
                System.out.println(name);
            }
        }
    }
}
