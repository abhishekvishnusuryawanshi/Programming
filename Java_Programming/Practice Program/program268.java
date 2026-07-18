import java.util.*;

class StringX
{
    public void Display(String str)
    {
        System.out.println("Recived string is :"+str);
    }
}

class program268
{
    public static void main(String A []) 
    {
        StringX strobj = new StringX();
        Scanner sobj = new Scanner(System.in);
        String str =null;
        
        System.out.println("Enter String:");
        str = sobj.nextLine();

        strobj.Display(str);



    }
}