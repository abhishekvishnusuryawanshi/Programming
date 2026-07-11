import java.util.Scanner;

class program140
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40,50};
        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)  //Bad Programming Practice
        {
        System.out.println(Arr[iCnt]);
        }
        
        System.out.println(iCnt);   //Error
    }
}