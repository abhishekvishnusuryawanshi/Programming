// Write a program to print all even number up to N

class Logic
{
    void PrintEvenNumbers(int N)
    {
        int iCnt = 0;

        
        for(iCnt = 1 ; iCnt < N ; iCnt++)

        if((iCnt % 2) == 0)
        {
            System.out.println("Even Number: "+iCnt);
        }   
              
    }
   
}

class program7
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumbers(20);
        
    } 
}
