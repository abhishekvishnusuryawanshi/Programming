/*
    Longest Consecutive Employee ID Sequence
*/
import java.util.*;

class program128
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of IDs : ");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter employee IDs :");
        for(int i = 0; i < n; i++)
        {
            Arr[i] = sc.nextInt();
        }

        Arrays.sort(Arr);

        int count = 1;
        int max = 1;
        int end = Arr[0];

        for(int i = 1; i < n; i++)
        {
            if(Arr[i] == Arr[i - 1] + 1)
            {
                count++;

                if(count > max)
                {
                    max = count;
                    end = Arr[i];
                }
            }
            else if(Arr[i] != Arr[i - 1])
            {
                count = 1;
            }
        }

        System.out.println("Longest consecutive sequence :");

        for(int i = end - max + 1; i <= end; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Length : " + max);
    }
}
