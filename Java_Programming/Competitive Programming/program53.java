/*
    Calculate courier price based on parcel weight
*/
import java.util.*;

class CourierCounter
{
    public void CalculatePrice(int iNo)
    {
        if(iNo <= 0)
        {
            System.out.println("Enter Vaild Weight !");
            return;
        }

        int cPrice = 0 ;
        System.out.println("Parcel Weight : "+iNo);
        
        if(iNo <= 1)
        {
            cPrice = cPrice + 50;
            
        }
        else if(iNo <= 5 )
        {
            cPrice = 50 + ((iNo - 1) * 20);
        }
        else
        {
            cPrice = 150 +((iNo - 5) * 30);      
        }

        System.out.println("Courier Price : "+cPrice);
    }     
}
class program53
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Parcel Weight : ");
        int iValue = sobj.nextInt();

        CourierCounter cobj = new CourierCounter();

        cobj.CalculatePrice(iValue);
    }
}
