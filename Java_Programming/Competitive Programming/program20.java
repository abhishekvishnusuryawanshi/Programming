// write a program to finde the Smallest digit in a given number.

class Logic
{
    void FindSmallestDigit(int iNum)
    {
        int iSmallest = iNum; 
        int iDigit = 0;

        while(iNum > 0)
        {
            iDigit = iNum % 10;

            if(iDigit < iSmallest)
            {
                iSmallest = iDigit;
            }

            iNum = iNum / 10;
        }

        System.out.println("Smallest Digit is : " + iSmallest);
    }


}
class program20
{
    public static void main(String[] args) 
    {   
        Logic obj = new Logic();
        obj.FindSmallestDigit(455872);      
    }
}
