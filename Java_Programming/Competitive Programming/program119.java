/*
    An e-commerce warehouse maintains Product ID and Available Quantity.
    Implement operations to add, sell, restock and search products.
*/

import java.util.*;

class program334
{
    public static void main(String args[])
    {
        HashMap<Integer, Integer> hobj =
            new HashMap<Integer, Integer>();

        hobj.put(101, 50);
        hobj.put(102, 30);

        hobj.put(101, hobj.get(101) - 5);

        hobj.put(102, hobj.get(102) + 20);

        if(hobj.containsKey(101))
        {
            System.out.println("Product 101 available quantity : "
                    + hobj.get(101));
        }
        else
        {
            System.out.println("Product 101 does not exist");
        }
    }
}
