// Write a program to print all Odd number up to N

class Logic
{
    void PrintOddNumbers(int N)
    {
        int iCnt = 0;

        
        for(iCnt = 1 ; iCnt < N ; iCnt++)

        if((iCnt % 2) != 0)
        {
            System.out.println("Odd Number: "+iCnt);
        }   
              
    }
   
}

class program8

{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintOddNumbers(20);
        
    } 
}
