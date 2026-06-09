//Write a program to find the sum of digits of a number.

class Logic
{
    void SumOfDigits(int num)
    {
        int iSum = 0;

        while(num > 0)
        {
            iSum = iSum + (num % 10);     // Extract last digit
            num = num / 10;             // Remove last digit
        }

        System.out.println("Sum of digits = " + iSum);
    }
}
class program81
{
    public static void main (String A [])
    {
        Logic obj = new Logic();
        obj.SumOfDigits(1234);
        
    }
}
