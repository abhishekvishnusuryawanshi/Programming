// Program to print the multiplication table of a number.

class Logic
{
    void PrintTable(int iNum)
    {
        int iTable = 0;

        for(int iCnt = 1 ; iCnt <= 10 ;iCnt ++)
        {
          iTable = iNum * iCnt;
          System.out.println(+ iTable);
        }

    }
}

class program85
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintTable(5);
        
    }
}
