/*
    Check whether the user can purchase items
    within the given budget
*/

import java.util.*;

class Store
{
    public void CheckBudget(int bAmt , int nItem , int iPrice)
    {
        if(bAmt < 0 || nItem < 0 || iPrice < 0)
        {
            System.out.println("Enter Vaild Inputs");
            return;
        }

        bAmt = bAmt - (nItem * iPrice);

        System.out.println("Items Purchased : "+nItem);
        System.out.println("Remaining Balance : "+bAmt);


    }
}

class program54
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Budget Amount : ");
        int bAmount = sobj.nextInt();

        System.out.println("Enter Number of Item ");
        int item = sobj.nextInt();

        System.out.println("Enter Item Price");
        int price = sobj.nextInt();

        Store obj = new Store();
        obj.CheckBudget(bAmount, item, price);

    }
}
