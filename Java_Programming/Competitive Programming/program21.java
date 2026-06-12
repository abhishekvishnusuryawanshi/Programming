// write a program to calculate the product of Digit of Number.

class Logic
{
    void ProductOfDigit(int iNum)
    {
         int iDigit = 0;
        int iProduct = 1;

        while(iNum > 0)
        {
            iDigit = iNum % 10;
            iProduct = iProduct * iDigit;
            iNum = iNum / 10;
        }

        System.out.println("Product of Digits : " + iProduct);
        
    }

}
class program21
{
    public static void main(String[] args) 
    {   
        Logic obj = new Logic();
        obj.ProductOfDigit(234);     
    }
}
