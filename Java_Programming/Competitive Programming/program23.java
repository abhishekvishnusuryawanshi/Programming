// write a program to display all factor of a given number.

class Logic
{
    void DisplayFactor(int iNum)
    {   
        int iCnt = 0;

        for(iCnt= 1 ; iCnt < iNum ; iCnt++)
        if((iNum % iCnt)==0)
        {
            System.out.println("factor  : " + iCnt);

        }       
    }

}
class program23
{
    public static void main(String[] args) 
    {   
        Logic obj = new Logic();
        obj.DisplayFactor(12);    
    }
}
