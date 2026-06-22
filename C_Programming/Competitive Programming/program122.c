/*
   Accept a character from the user and check whether it is a capital alphabet or not.
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckCap(char ch)
{
    if((ch >= '0' && ch <= '9') )
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

    bRet = CheckCap(cValue);

    if(bRet == TRUE)
    {
        printf("It is Capital Character");
    }
    else
    {
        printf("It is Not Capital a Character");
    }
    return 0;
}
