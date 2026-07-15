import java.util.*;

class program181
{
    public static void Display(int iNo)
    {
        int iCnt = 0 ;
        char ch = '\0';

        for(iCnt = 1 , ch = 97 ; iCnt <= iNo; iCnt++,ch++)
        {
            System.out.print(ch+"\t");
            
        }
  
    
    }
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number of Elements:");
        iValue = sobj.nextInt();

        Display(iValue);


  
    }
}