//Write a program to check whether a number is a palindrome or Not.

class Logic
{
        void CheckPalindrome(int num)
    {
        int iOriginal = num;
        int iReverse = 0;

        while(num > 0)
        {
            int iDigit = num % 10;
            iReverse = iReverse * 10 + iDigit;
            num = num / 10;
        }

        if(iOriginal == iReverse)
        {
            System.out.println("The Number is Palindrome: " + iOriginal);
        }
        else
        {
            System.out.println("The Number is Not Palindrome: " + iOriginal);
        }
    }  
}

class program2
{
    public static void main (String A [])
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);
        
    }
}
