import java.util.*;

class StringX
{
    public String toUpperX(String str)
    {
        char Arr [] = str.toCharArray();        

        for(int i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z' )
            {
                Arr[i] = (char)(Arr[i] -32);
            }
        }
         return new String(Arr);               

    }

    public String toLowerX(String str)
    {
        char Arr [] = str.toCharArray();        

        for(int i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z' )
            {
                Arr[i] = (char)(Arr[i] +32);
            }
        }
         return new String(Arr);               

    }

    public String toToggleX(String str)
    {
        char Arr [] = str.toCharArray();        

        for(int i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z' )
            {
                Arr[i] = (char)(Arr[i] +32);
            }
            else                                //Issue
            {
                Arr[i] = (char)(Arr[i] -32);                
            }
        }
         return new String(Arr);               

    }

}

class program288
{
    public static void main(String A []) 
    {
        StringX strobj = new StringX();
        Scanner sobj = new Scanner(System.in);
        String data = null;
        String sRet = null;
        
        System.out.println("Enter String:");
        data = sobj.nextLine();

        sRet = strobj.toUpperX(data);
        System.out.println("Upadted String:"+sRet);

        sRet = strobj.toLowerX(data);
        System.out.println("Upadted String:"+sRet);

        sRet = strobj.toToggleX(data);
        System.out.println("Upadted String:"+sRet);





    }
}