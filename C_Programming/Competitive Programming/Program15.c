//////////////////////////////////////////////////////////////
//
// This program checks whether the given character is a vowel or not.
//
//////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool CheckVowel(char cValue)
{
    if(cValue == 'a' || cValue == 'e' || cValue == 'i' || cValue == 'o' || cValue == 'u' ||
       cValue == 'A' || cValue == 'E' || cValue == 'I' || cValue == 'O' || cValue == 'U')
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    char cValue = '\0';
    bool bRet  = false;

    printf("Enter a Letter :");
    scanf("%c",&cValue);

    bRet=CheckVowel(cValue);

    if(bRet == true)
    {
        printf("It is a Vowel: %c",cValue);
    }
    else
    {
        printf("It is NOT a Vowel: %c",cValue);
    }


    return 0;
}