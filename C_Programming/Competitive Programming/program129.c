/*
Write a program which accept string from user and check whether it contain vowels in it or not.
*/

#include<stdio.h>
typedef int BOOL;
#define FALSE 0
#define TRUE 1

BOOL ChkVowel(char *str)
{ 
    int i = 0;

    while (str[i] != '\0')
    {
        if (str[i] == 'A'||str[i] == 'E'||str[i] == 'I'||str[i] == 'O'||str[i] == 'U'||
            str[i] == 'a'||str[i] == 'e'||str[i] == 'i'||str[i] == 'o'||str[i] == 'u')
        {
            return TRUE;
        }
        i++;

    }
    return FALSE;
}


int main()
{
    char arr[20];
    BOOL bRet = FALSE;

    printf("Enter String");
    scanf("%[^'\n']s",arr);

    bRet = ChkVowel(arr);

    if(bRet == TRUE)
    {
        printf("Contain Vowel : \n");
    }
    else
    {
        printf("Not Contain Vowel");
    }

    return 0;
}
