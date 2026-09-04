/*
    Write a program to count Vowel and consonants from the string
*/
import java.util.Scanner;

class stringX
{
    public void CountVowelnConst(String str)
    {
        char A[] = str.toCharArray();

        int i = 0;
        int iVowel = 0;
        int iConsonant = 0;

        for(i = 0; i < A.length; i++)
        {
            if(A[i] == 'a' || A[i] == 'e' || A[i] == 'i' ||
               A[i] == 'o' || A[i] == 'u' ||
               A[i] == 'A' || A[i] == 'E' || A[i] == 'I' ||
               A[i] == 'O' || A[i] == 'U')
            {
                iVowel++;
            }
            else if((A[i] >= 'a' && A[i] <= 'z') ||
                    (A[i] >= 'A' && A[i] <= 'Z'))
            {
                iConsonant++;
            }
        }

        System.out.println("Vowels : " + iVowel);
        System.out.println("Consonants : " + iConsonant);
    }
}

class program86
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        stringX xobj = new stringX();

        xobj.CountVowelnConst(str);

    }
}
