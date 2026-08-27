/*
    Calculate student totals, find the topper, calculate subject averages and identify failed students.
*/
import java.util.Scanner;

class StudentMarks
{
    public void Calculate(int Arr[][], int N, int M)
    {
        int Total[] = new int[N];
        int SubjectTotal[] = new int[M];

        int Topper = 0;

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                Total[i] = Total[i] + Arr[i][j];
                SubjectTotal[j] = SubjectTotal[j] + Arr[i][j];
            }

            if(Total[i] > Total[Topper])
            {
                Topper = i;
            }
        }

        System.out.println("Student Totals:");

        for(int i = 0; i < N; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + Total[i]);
        }

        System.out.println("Topper: Student " + (Topper + 1));

        System.out.println("Subject Averages:");

        for(int i = 0; i < M; i++)
        {
            double Average = (double)SubjectTotal[i] / N;
            System.out.printf("Subject %d: %.2f%n", (i + 1), Average);
        }

        System.out.println("Students Failed:");

        for(int i = 0; i < N; i++)
        {
            boolean bFailed = false;

            for(int j = 0; j < M; j++)
            {
                if(Arr[i][j] < 35)
                {
                    bFailed = true;
                    break;
                }
            }

            if(bFailed == true)
            {
                System.out.println("Student " + (i + 1));
            }
        }
    }
}

class program65
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Students");
        int iN = sobj.nextInt();

        System.out.println("Enter Number of Subjects");
        int iM = sobj.nextInt();

        if(iN <= 0 || iM <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[iN][iM];

        System.out.println("Enter Marks");

        for(int i = 0; i < iN; i++)
        {
            for(int j = 0; j < iM; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] < 0 || Arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        StudentMarks sobj1 = new StudentMarks();
        sobj1.Calculate(Arr, iN, iM);
    }
}
