/*
Accept distance in kilometres and peak time status from the user. Calculate the fare based on distance and add 20% extra fare during peak time.
*/
import java.util.Scanner;

class FareCalculation
{
    public void CalculateFare(float Distance , String str)
    {
        if(Distance <= 0 ||
         (!str.equals("Yes") && !str.equals("No")))
        {
            System.out.println("Invaild Input");
            return; 
        }

        float fCal = 0.0f;

        if(Distance <= 10)
        {
            fCal = 10 *(Distance);
        }

        else if(Distance > 10)
        {
            fCal = 12 *(Distance);
        }

        if(str.equals("Yes"))
        {
            fCal = fCal +(fCal * 20 / 100);
        }


        System.out.println("Distance : "+Distance);
        System.out.println("Total Fare : "+ fCal);
    }

}

class program51
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Distance in KM");
        float iDis =sobj.nextFloat();

        sobj.nextLine();

        System.out.println("Are you in the Pick Time [Yes or No] ");
        String sPeek =sobj.nextLine();

        FareCalculation fobj = new FareCalculation();

        fobj.CalculateFare(iDis, sPeek);

    }
}
