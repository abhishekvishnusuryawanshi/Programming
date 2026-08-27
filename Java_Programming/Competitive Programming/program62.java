/*
    Count valid votes and reject duplicate voter IDs.
*/

import java.util.Scanner;

class Election
{
    public void Vote(int N, int ID[])
    {
        if(N < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int ValidVotes = 0;
        int RejectedVotes = 0;

        for(int i = 0; i < N; i++)
        {
            boolean bFound = false;

            for(int j = 0; j < i; j++)
            {
                if(ID[i] == ID[j])
                {
                    bFound = true;
                    break;
                }
            }

            if(bFound == true)
            {
                RejectedVotes++;
            }
            else
            {
                ValidVotes++;
            }
        }

        System.out.println("Valid Votes: " + ValidVotes);
        System.out.println("Rejected Duplicate Votes: " + RejectedVotes);
    }
}

class program62
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Votes");
        int iN = sobj.nextInt();

        int ID[] = new int[iN];

        System.out.println("Enter Voter IDs");

        for(int i = 0; i < iN; i++)
        {
            ID[i] = sobj.nextInt();
        }

        Election eobj = new Election();
        eobj.Vote(iN, ID);
    }
}
