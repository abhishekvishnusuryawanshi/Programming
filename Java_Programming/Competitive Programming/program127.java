/*
    Find Two Transactions Matching a Target
*/
import java.util.*;

class program127
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions : ");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter transactions :");
        for(int i = 0; i < n; i++)
        {
            Arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value : ");
        int target = sc.nextInt();

        boolean bFlag = false;

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(Arr[i] + Arr[j] == target)
                {
                    System.out.println(Arr[i] + " + " + Arr[j] + " = " + target);
                    bFlag = true;
                }
            }
        }

        if(bFlag == false)
        {
            System.out.println("No matching transactions found");
        }
    }
}
