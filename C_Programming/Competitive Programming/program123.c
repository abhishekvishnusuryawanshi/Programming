/*
   Accept a character from the user and check whether it is digit or not (0-9).
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckDigit(char ch)
{
    if((ch >= '0') && (ch <= '9') )
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

    bRet = CheckDigit(cValue);

    if(bRet == TRUE)
    {
        printf("It is Digit");
    }
    else
    {
        printf("It is Not Digit");
    }
    return 0;
}
