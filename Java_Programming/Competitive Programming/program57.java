/*
    Calculate bus fare based on distance, class type,
    booking time, and passenger age.
*/
import java.util.Scanner;

class BusFare
{
    public void CalculateFare(int distance, String cType, int hours, int age)
    {
        if(distance < 0 || hours < 0 || age < 0 ||
           (!cType.equals("Sleeper") && !cType.equals("3AC") && !cType.equals("2AC")))
        {
            System.out.println("Invaild Input");
            return;
        }

        int basicFare = 0 ;
        int tatkalCharge = 0 ;
        int finalFare = 0 ;
        int seniorDiscount = 0;

        if(cType.equals("Sleeper"))
        {
            basicFare = distance * 50;
        }
        else if(cType.equals("2AC"))
        {
            basicFare = distance * 75;
        }
        else 
        {
            basicFare = distance * 100;
        }

        if(hours <= 24)
        {
            tatkalCharge = (basicFare * 30) / 100;
        }

        int fareAfterTatkal = basicFare + tatkalCharge;

        if( age >= 60)
        {
            seniorDiscount = (fareAfterTatkal * 40 ) / 100;
        }

        finalFare = fareAfterTatkal - seniorDiscount ;

        System.out.println("Basic Fare : " + basicFare);
        System.out.println("Tatkal Charge : " + tatkalCharge);
        System.out.println("Senior Discount : " + seniorDiscount);
        System.out.println("Final Fare : " + finalFare);


        
    }
}

class program57
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iDist = 0 , iHour = 0 , iAge = 0 ; 
        String cType = null;

        System.out.println("Enter a Distance : ");
        iDist = sobj.nextInt();

        System.out.println("Enter Booking Hours : ");
        iHour = sobj.nextInt();

        System.out.println("Enter Age : ");
        iAge = sobj.nextInt();

        sobj.nextLine();

        System.out.println("Enter Class Type :");
        cType = sobj.nextLine();

        BusFare bobj = new BusFare();

        bobj.CalculateFare(iDist, cType, iHour, iAge);

    }
}
