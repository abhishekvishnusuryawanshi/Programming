/*
    Write a program to Count dupilcate charcter from string.
*/
import java.util.*;

class Logic
{
    public void CountDuplicate(String str)
    {
        int Arr[] = new int[256];

        for(int i = 0; i < str.length(); i++)
        {
            Arr[str.charAt(i)]++;
        }

        for(int i = 0 ; i < 256 ; i++)
        {
            if(Arr[i] > 0)
            {
    
                System.out.println((char)i + " : " + Arr[i]);
            }
        }

    }
}

class program82
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        Logic lobj = new Logic();
        lobj.CountDuplicate(str);        
    }
}
