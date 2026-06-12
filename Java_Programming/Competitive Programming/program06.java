// Program to check whether a Number is prim or Not.

class Logic
{
    void CheckPrime(int iNum)
    {
        int iCnt = 0;

        
        for(iCnt = 2 ; iCnt <iNum ; iCnt++)
        if(iNum % iCnt == 0)
        {
            System.out.println("Not Prime");
            return;
        }   
        System.out.println("The Number is Prime: "+iNum);        
    }
   
}

class program6
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
        
    }
}
