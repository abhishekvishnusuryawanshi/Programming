/*
    A hospital receives patients with severity levels.
    Higher severity should be treated first.
    Create a Patient class containing String name and int severity.
*/

import java.util.*;

class Patient
{
    String Name;
    int Severity;

    Patient(String Name, int Severity)
    {
        this.Name = Name;
        this.Severity = Severity;
    }
}

class program124
{
    public static void main(String args[])
    {
        PriorityQueue<Patient> queue =
            new PriorityQueue<Patient>(
                new Comparator<Patient>()
                {
                    public int compare(Patient p1, Patient p2)
                    {
                        return p2.Severity - p1.Severity;
                    }
                }
            );

        queue.add(new Patient("Rahul", 2));
        queue.add(new Patient("Amit", 5));
        queue.add(new Patient("Pooja", 1));
        queue.add(new Patient("Neha", 4));

        System.out.println("Treatment Order:");

        while(!queue.isEmpty())
        {
            Patient p = queue.remove();

            System.out.println(p.Name);
        }
    }
}
