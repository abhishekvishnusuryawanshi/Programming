/*
    Create a Student class and display students according to descending marks.
    If two students have equal marks, sort them alphabetically.
*/

import java.util.*;

class Student
{
    String Name;
    int Marks;

    Student(String Name, int Marks)
    {
        this.Name = Name;
        this.Marks = Marks;
    }
}

class program121
{
    public static void main(String args[])
    {
        ArrayList<Student> sobj = new ArrayList<Student>();

        sobj.add(new Student("Amit", 78));
        sobj.add(new Student("Pooja", 92));
        sobj.add(new Student("Rahul", 85));
        sobj.add(new Student("Neha", 92));
        sobj.add(new Student("Kiran", 67));

        Collections.sort(sobj, new Comparator<Student>()
        {
            public int compare(Student s1, Student s2)
            {
                if(s1.Marks != s2.Marks)
                {
                    return s2.Marks - s1.Marks;
                }
                else
                {
                    return s1.Name.compareTo(s2.Name);
                }
            }
        });

        for(int i = 0; i < sobj.size(); i++)
        {
            System.out.println(sobj.get(i).Name + "    "
                    + sobj.get(i).Marks);
        }
    }
}
