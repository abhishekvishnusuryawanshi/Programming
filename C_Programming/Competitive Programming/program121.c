/*
    Accept a character from the user and check whether it is an alphabet or not. If the character is an alphabet.
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckAlfa(char ch)
{
    if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{

    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter a Character : \n");
    scanf("%c",&cValue);

    bRet = CheckAlfa(cValue);

    if(bRet == TRUE)
    {
        printf("It is a Character");
    }
    else
    {
        printf("It is Not a Character");
    }
    return 0;
}
