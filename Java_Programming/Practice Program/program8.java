/////////////////////////////////////////////////////////////////
//
// Program accepts an integer from the user and counts the number of even and odd
// digits present in the given number.
//
///////////////////////////////////////////////////////////////

import java.util.*;

class DigitX 
{
    public void  CountEvenOddDigit(int iNo)
    {
        int iDigit = 0;
        int iCountEven = 0;
        int iCountOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
               iCountEven ++; 
               
            }
            else
            {
                iCountOdd ++;
                
            }
            iNo = iNo /10;
        }   
      System.out.println("Number of Even Digit: "+iCountEven);
      System.out.println("Number of Odd Digit: " +iCountOdd);
    }
}

class program8
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();
        

       dobj.CountEvenOddDigit(iValue);

       
    }

}
