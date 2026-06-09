// Write a program to find the minmum of two numbers.

class Logic
{
    void findMin(int a, int b)
    {
        if(a < b)
        {
            System.out.println("Minimum number is : " + a);
        }
        else
        {
            System.out.println("Minimum number is : " + b);
        }

    }

}  

class program84
{
    public static void main (String A [])
    {
        Logic obj = new Logic();
        obj.findMin(20,15);
        
    }
}
