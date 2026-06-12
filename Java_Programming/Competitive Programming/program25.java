// write a program to print all numbers from 1 to N that are divisible by both 2 & 3.

class Logic
{
    void PrintDivisibleBy2and3(int iNum)
    {   
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNum ; iCnt++)

        if((iCnt % 2)==0 && ( iCnt % 3)==0)
        {
            
            System.out.println("Number From 1 to N: " + iCnt);
            
        }   
           
    }

}
class program25
{
    public static void main(String[] args) 
    {   
        Logic obj = new Logic();
        obj.PrintDivisibleBy2and3(30);  
    }
}
