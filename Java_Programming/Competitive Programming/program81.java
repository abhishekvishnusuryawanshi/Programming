/*
    Write a program to print dupilcate charcter from string.
*/
import java.util.*;

class Logic
{
    public void CheckDuplicate(String str)
    {
        int Arr[] = new int[256];

        for(int i = 0; i < str.length(); i++)
        {
            Arr[str.charAt(i)]++;
        }

        for(int i = 0 ; i < 256 ; i++)
        {
            if(Arr[i] > 1)
            {
                System.out.print((char)(i)+" ");
            }
        }

    }
}

class program81
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        Logic lobj = new Logic();
        lobj.CheckDuplicate(str);        
    }
}
