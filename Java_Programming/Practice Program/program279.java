import java.util.*;

class StringX
{
    public String Update(String str)
    {
        char Arr [] = str.toCharArray();        //converted into character Array

        for(int i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] == 'A'|| Arr[i] == 'a')
            {
                Arr[i]= '_';                    //update character array
            }

        }
         return new String(Arr);   // covert to string Return Directly

    }

}

class program279
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