/*
Accept annual income from the user and calculate the total income tax
according to the given income slabs.
*/
import java.util.Scanner;

class IncomeTax
{
    public void CheckTax(double dincome)
    {

        double tAmount = 0.0;
        double aAmount = dincome;

        if(dincome <= 0)
        {
            System.out.println("Invaild Input");
            return;
        }

        if(dincome <= 250000)
        {
            tAmount = tAmount;
        }
        else if(dincome <= 500000)
        {
            tAmount = aAmount * 5.0 / 100;

        }
        else if(dincome <= 1000000)
        {
            tAmount = aAmount * 20 / 100;
        }
        else 
        {
            tAmount = aAmount * 30 / 100;
        }

        System.out.println("Annual Income : "+dincome);
        System.out.println("Total Tax Payable :  "+tAmount);
    }
}

class program50
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Annual Income:");
        double dincome = sobj.nextDouble();

        IncomeTax iobj = new IncomeTax();

        iobj.CheckTax(dincome);
    }
}
