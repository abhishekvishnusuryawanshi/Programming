import java.util.*;


class program276
{
    public static void main(String A []) 
    {
        StringX strobj = new StringX();     //Error
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

        iRet = strobj.CountSpecial(data);
        System.out.println("Number of Special Symbol Are "+iRet);



    }
}