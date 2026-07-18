import java.util.*;

class StringX
{
    public String Update(String str)
    {
        char Arr [] = str.toCharArray();

        for(int i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] == 'A'|| Arr[i] == 'a')
            {
                Arr[i]= '_';
            }

        }
        String ret = new String(Arr);   // covert char Arr to String

        return ret;
    }

}

class program278
{
    public static void main(String A []) 
    {
        StringX strobj = new StringX();
        Scanner sobj = new Scanner(System.in);
        String data = null;
        String sRet = null;
        
        System.out.println("Enter String:");
        data = sobj.nextLine();

        sRet = strobj.Update(data);
        System.out.println("Upadted String:"+sRet);





    }
}