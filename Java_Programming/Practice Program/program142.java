import java.util.Scanner;

class program142
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
        
        System.out.println("Enter the Number of Elements");
        int iLength = sobj.nextInt();

        int Brr[] = new int[ilength];

        System.out.println("Enter the Elements:");

        for(iCnt = 0 ; iCnt < Brr.ilength; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the Array are:");

        for(iCnt = 0 ; iCnt < Brr.iLength; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
        
        Brr = null;
        System.gc();
        
    }
}