// write a program to count total number of factor of a given number.

class Logic
{
    void CountFactor(int iNum)
    {   
        int iCnt = 0;
        int iCount = 0;


        for(iCnt= 1 ; iCnt < iNum ; iCnt++)
        if((iNum % iCnt)==0)
        {
            iCount ++;
            
        }   
        System.out.println("The Number of Factor :"+iCount);    
    }

}
class program24
{
    public static void main(String[] args) 
    {   
        Logic obj = new Logic();
        obj.CountFactor(20);    
    }
}
