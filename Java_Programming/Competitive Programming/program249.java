/*
Accept information about helmet, driving license and overspeeding
and calculate the total fine.
*/

import java.util.Scanner;

class Police
{
    private String hel;
    private String lic;
    private String spd;

    public Police(String hel, String lic, String spd)
    {
        this.hel = hel;
        this.lic = lic;
        this.spd = spd;
    }

    public void CheckFine()
    {
        if((!hel.equals("Yes") && !hel.equals("No")) ||
           (!lic.equals("Yes") && !lic.equals("No")) ||
           (!spd.equals("Yes") && !spd.equals("No")))
        {
            System.out.println("Invalid Input : Only Yes or No");
            return;
        }

        int fhel = 0;
        int flic = 0;
        int oSpd = 0;
        int totalFine = 0;

        if(hel.equals("No"))
        {
            fhel = 500;
        }

        if(lic.equals("No"))
        {
            flic = 1000;
        }

        if(spd.equals("Yes"))
        {
            oSpd = 1500;
        }

        totalFine = fhel + flic + oSpd;

        if(totalFine == 0)
        {
            System.out.println("All Documents Okay");
        }
        else
        {
            System.out.println("Helmet Fine : " + fhel);
            System.out.println("License Fine : " + flic);
            System.out.println("Overspeeding Fine : " + oSpd);
            System.out.println("Total Fine Amount : " + totalFine);
        }
    }
}

class program264
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String helmet = null;
        String license = null;
        String speeding = null;

        System.out.println("Enter Only In [Yes / No]");

        System.out.println("Helmet Worn : ");
        helmet = sobj.nextLine();

        System.out.println("Having a Driving License : ");
        license = sobj.nextLine();

        System.out.println("OverSpeeding : ");
        speeding = sobj.nextLine();

        Police pobj = new Police(helmet, license, speeding);

        pobj.CheckFine();
    }
}
