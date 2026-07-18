import java.util.*;

class StringX
{
    public void Display(String str)
    {
        System.out.println("Recived string is :"+str);
    }
}

class program269
{
    public static void main(String A []) 
    {
        StringX strobj = new StringX();
        Scanner sobj = new Scanner(System.in);
        String data = null;
        
        System.out.println("Enter String:");
        data = sobj.nextLine();

        strobj.Display(data);



    }
}