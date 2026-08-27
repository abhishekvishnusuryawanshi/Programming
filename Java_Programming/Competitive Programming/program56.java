/*
    Calculate hospital bill based on hospitalization days,
    medicine bill, consultation fee, ward type, and insurance status.
*/
import java.util.Scanner;

class HospitalBill
{
    public void CalculateBill(int day , int mFee , int cFee , String wType , String iType)
    {
        if(day < 0 || mFee < 0 || cFee <0 || 
        (!wType.equals("Normal") && !wType.equals("ICU"))|| 
        (!iType.equals("Yes") && !iType.equals("No") ))
        {
            System.out.println("Enter Valid Details");
            return;
        }

        int roomCharge = 0;
        int totalBill = 0;

        if(wType.equals("Normal"))
        {
            roomCharge = day * 2000;
        }
        else
        {
            roomCharge = day * 4000;
        }

        totalBill = mFee + cFee + roomCharge;

        int insuranceCover = 0;

        if(iType.equals("Yes"))
        {
            insuranceCover = (totalBill * 70) / 100;

            if(insuranceCover > 50000)
            {
                insuranceCover = 50000;
            }
        }

        int finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill : " + totalBill);
        System.out.println("Insurance Cover : " + insuranceCover);
        System.out.println("Final Pay : " + finalPay);

    }
}

class program56
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int idays = 0 , iMed = 0 , iConsult = 0 ;
        String wardType = null , insured = null ;

        System.out.println("Enter Number of Day Hospitalized : ");
        idays = sobj.nextInt();

        System.out.println("Enter Medicine Bill Amount : ");
        iMed = sobj.nextInt();

        System.out.println("Enter Consultation Fee : ");
        iConsult = sobj.nextInt();

        sobj.nextLine();

        System.out.println("Ward Type (Normal / ICU) :");
        wardType = sobj.nextLine();

        System.out.println("Insured (Yes / No)");
        insured = sobj.nextLine();

        HospitalBill hobj = new HospitalBill();

        hobj.CalculateBill(idays, iMed,iConsult, wardType , insured );
        
    }
}
