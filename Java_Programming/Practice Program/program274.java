import java.util.*;

class StringX
{
    public int CountCapital(String str)
    { 
        int i = 0;
        int iCount = 0; 
        char Arr[] = str.toCharArray();

        for(i =0 ; i< Arr.length ; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSmall(String str)
    { 
        int i = 0;
        int iCount = 0; 
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountDigits(String str)
    { 
        int i = 0;
        int iCount = 0; 
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSpace(String str)
    { 
        int i = 0;
        int iCount = 0; 
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program274
{
    public static void main(String A []) 
    {
        StringX strobj = new StringX();
        Scanner sobj = new Scanner(System.in);
        String data = null;
        int iRet = 0;
        
        System.out.println("Enter String:");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);
        System.out.println("Number of Capital Character: "+iRet);

        iRet = strobj.CountSmall(data);
        System.out.println("Number of Small Character: "+iRet);

        iRet = strobj.CountDigits(data);
        System.out.println("Number of Digit Are "+iRet);

        iRet = strobj.CountSpace(data);
        System.out.println("Number of White Space Are "+iRet);



    }
}