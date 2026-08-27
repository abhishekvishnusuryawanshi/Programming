/*
   Count the days that achieved the 10000-step goal and find the maximum steps in the week.
*/
import java.util.Scanner;

class Fitness
{
    public void Calculate(int Steps[])
    {
        int GoalDays = 0;
        int MaxSteps = Steps[0];

        for(int i = 0; i < 7; i++)
        {
            if(Steps[i] >= 10000)
            {
                GoalDays++;
            }

            if(Steps[i] > MaxSteps)
            {
                MaxSteps = Steps[i];
            }
        }

        System.out.println("Goal Achieved Days: " + GoalDays);
        System.out.println("Maximum Steps in Week: " + MaxSteps);
    }
}

class program278
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Steps[] = new int[7];

        System.out.println("Enter Steps for 7 Days");

        for(int i = 0; i < 7; i++)
        {
            Steps[i] = sobj.nextInt();
        }

        Fitness fobj = new Fitness();
        fobj.Calculate(Steps);
    }
}
