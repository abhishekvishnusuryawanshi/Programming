/*
    Write a program to Remove Duplicate Characcter from String
*/
import java.util.*;

class stringX
{
    public void RemoveDuplicateCharaccter(String str)
    {
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            boolean bFlag = false;

            for(int j = 0; j < i; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    bFlag = true;
                    break;
                }
            }

                if(bFlag == false)
                {
                    System.out.print(Arr[i]);
                }
        }
}
    }

class program85
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        stringX xobj = new stringX();
        xobj.RemoveDuplicateCharaccter(str);
    }
}
