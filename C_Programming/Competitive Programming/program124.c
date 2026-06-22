/*
   Accept a character from the user and check whether it is small case or not (a-z).
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckSmall(char ch)
{
    if((ch >= 'a') && (ch <= 'z'))
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

    bRet = CheckSmall(cValue);

    if(bRet == TRUE)
    {
        printf("It is Small Case Character");
    }
    else
    {
        printf("It is Not a Small case Character");
    }
    return 0;
}
