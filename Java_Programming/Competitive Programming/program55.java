/*
    Check battery status based on battery percentage
*/
import java.util.Scanner;

class Battery
{
    public void BatteryStatus(int iPercentage)
    {
        if(iPercentage < 0 || iPercentage > 100)
        {
            System.out.println("Enter Vaild Details ");
            return;
        }

        if(iPercentage <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(iPercentage <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Normal");
        }
    }
}

class program55
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Battery Percentage :");
        int iBat = sobj.nextInt();

        Battery bobj = new Battery();
        bobj.BatteryStatus(iBat);

    }
}
