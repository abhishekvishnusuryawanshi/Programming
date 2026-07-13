import java.util.*;

class program172
{
    public static void Display(int iNo)
    {
        int iCnt = 0 ;
        int iCount = 1;

        for(iCnt = 1 ,iCount = 1 ; iCnt <= iNo; iCnt++)
        
         if((iCnt % 2)==0)
        {
            System.out.print("*\t");
        }
        else
        {
            System.out.print(+iCount"\t");
            iCount++;
        }
    
    }
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the NUmber of Elements:");
        iValue = sobj.nextInt();

        Display(iValue);


  
    }
}