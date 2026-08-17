/*
    Accept age, monthly income, credit score, and existing loan status
    from the user and check whether the customer is eligible for a loan.
    Display the approval status or the reason for rejection.
*/

import java.util.*;

class Bank
{
    public void LoanEligiblity(int iAge, float fIncome, int cScore, String str)
    {
        if(iAge <= 0 || fIncome <= 0 || cScore <= 0 ||
           (!str.equals("Yes") && !str.equals("No")))
        {
            System.out.println("Enter Vaild Details");
            return;
        }

        if(iAge < 21 || iAge > 60)
        {
            System.out.println("LOAN REJECTED : Due to Age ");
        }

        else if(fIncome <= 25000)
        {
            System.out.println("LOAN REJECTED : Lower Income");
        }

        else if(cScore <= 700)
        {
            System.out.println("LOAN REJECTED : Credit Score is Low ");
        }
        else if(str.equals("Yes"))
        {
            System.out.println("LOAN REJECTED : Because you have an Existing/Pending Loan ");
        }
        else
        {
            System.out.println("LOAN APPROVED");
        }
    }
}

class program47
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0, cScore = 0;
        float mIncome = 0.0f;
        String str = null;

        System.out.println("Enter your Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter your Monthly Income : ");
        mIncome = sobj.nextFloat();

        System.out.println("Enter Your Credit Score : ");
        cScore = sobj.nextInt();

        sobj.nextLine();

        System.out.println("Is there any Existing Loan Yes or No : ");
        str = sobj.nextLine();

        Bank bobj = new Bank();

        bobj.LoanEligiblity(Age, mIncome, cScore, str);
    }
}
