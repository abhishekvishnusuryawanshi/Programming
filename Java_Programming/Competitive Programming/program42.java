/*
ATM Withdrawal: Accept account balance and withdrawal amount, validate ATM withdrawal rules, and display the transaction result and remaining balance.
*/
import java.util.*;


class program42
{

    public static void Transaction(int cBal , int Widraw)
    {
        if(cBal < 0 || Widraw < 0)
        {
            System.out.println("Please Enter Valid Input");
            return;
        }

        if(Widraw % 100 != 0)
        {
            System.out.println("Transaction Failed : Withdrawal Amount Must be Multiple of 100");
            return;
        }

        if(Widraw > 25000)
        {
            System.out.println("Transaction Failed : Maximum Withdrawal Limit is 25000");
            return;
        }

        if(Widraw > cBal)
        {
            System.out.println("Transaction Failed : Withdrawal Amount is Greater than Account Balance");
            return;
        }

        if((cBal - Widraw) < 1000)
        {
            System.out.println("Transaction Failed : Minimum Account Balance Should be 1000");
            return;
        }

        cBal = cBal - Widraw;

        System.out.println("Transaction Successful");
        System.out.println("Remaining Balance : " + cBal);
     
    }


    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Current Balance in Account : ");
        int bal = sobj.nextInt();

        System.out.println("Enter Amount to Withdrawal : ");
        int widraw = sobj.nextInt();

        Transaction(bal,widraw);
    }
}
