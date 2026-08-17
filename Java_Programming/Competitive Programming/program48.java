/*
Accept current stock and requested quantity from the user.
Check whether the requested quantity is available in the warehouse.
Display the remaining stock and a low stock alert if required.
*/

import java.util.Scanner;

class Warehouse
{
    private int cStock;
    private int rQuantity;

    public Warehouse(int cStock, int rQuantity)
    {
        this.cStock = cStock;
        this.rQuantity = rQuantity;
    }

    public boolean ValidateDetails()
    {
        if(cStock <= 0 || rQuantity <= 0)
        {
            return false;
        }

        return true;
    }

    public void CheckOrder()
    {
        int rStock = 0;

        if(!ValidateDetails())
        {
            System.out.println("Enter Valid Details");
            return;
        }

        if(rQuantity > cStock)
        {
            System.out.println("Order Failed: Insufficient Stock.");
        }
        else
        {
            rStock = cStock - rQuantity;

            System.out.println("Order Processed Successfully");
            System.out.println("Remaining Stock : " + rStock);

            if(rStock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }
    }
}

class program48
{
    public static void main(String A[])
    {
        int cStock = 0;
        int rQnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Current Stock : ");
        cStock = sobj.nextInt();

        System.out.println("Enter the Requested Quantity : ");
        rQnt = sobj.nextInt();

        Warehouse wobj = new Warehouse(cStock, rQnt);

        wobj.CheckOrder();
    }
}
